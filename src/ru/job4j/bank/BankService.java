package ru.job4j.bank;

import java.util.*;

public class BankService {
    private Map<User, List<Account>> users = new HashMap<>();

    public void addUser(User user) {
        users.putIfAbsent(user, new ArrayList<Account>());
    }

    public void addAccount(String passport, Account account) {
        Optional<User> user = findByPassport(passport);
        if(user != null) {
            List<Account> userAcc = users.get(user);
            if (!userAcc.contains(account)) {
                userAcc.add(account);
            }
        }
    }

    public Optional<User> findByPassport(String passport) {
        Optional<User> find = users.keySet().stream()
                .filter(user -> user.getPassport().equals(passport)).findFirst();

        return find;
    }

    public Optional<Account> findByRequisite(String passport, String requisite) {
        Optional<User> user = findByPassport(passport);
        if(user.isEmpty()) {
            return Optional.empty();
        }
            Optional<Account> userAcc = users.get(user).stream()
                    .filter(account -> account.getRequisite().equals(requisite)).findFirst();

        return userAcc;
    }

    public boolean transferMoney(String srcPassport, String srcRequisite,
                                 String destPassport, String destRequisite, double amount) {
        boolean rsl = false;
        Optional<Account> src = findByRequisite(srcPassport, srcRequisite);
        Optional<Account> dest = findByRequisite(destPassport, destRequisite);
        if(src.get().getRequisite() != null &&
                dest.get().getRequisite() != null &&
        src.get().getBalance() >= amount) {
            src.get().setBalance(src.get().getBalance() - amount);
            dest.get().setBalance(dest.get().getBalance() + amount);
            rsl = true;
        }
        return rsl;
    }
    public static void main(String[] args) {
        List<Account> accounts = new ArrayList<>();
        String requisite = "3fdsbb9";
        accounts.add(new Account("3fdsbb9", 140));
        int index = accounts.indexOf(new Account(requisite, -1));
        Account find = accounts.get(index);
        System.out.println(find.getRequisite() + " -> " + find.getBalance());
    }
}
