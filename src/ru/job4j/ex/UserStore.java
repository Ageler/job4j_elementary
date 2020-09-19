package ru.job4j.ex;

public class UserStore {
    public static User findUser(User[] users, String login) throws UserNotFoundException {
        User find = null;
        for (User user: users
             ) {
            if (user.getUsername().equals(login)) {
              find = user;
                System.out.println("User has been found!");
                break;
            }
        }
        if (find == null) {
            throw new UserNotFoundException();
        }
        return find;
    }

    public static boolean validate(User user) throws UserInvalidException {
        boolean valid = true;
        valid = user.isValid();
        if(!valid || user.getUsername().length() < 3) {
            valid = false;
            throw new UserInvalidException();
        }
        return valid;
    }

    public static void main(String[] args) {
        User[] users = {
                new User("Petr Arsentev", true)
        };
        try {
            User user = findUser(users, "Petr Arsentev");
            if (validate(user)) {
                System.out.println("This user has an access");
            }
        }
        catch (UserInvalidException en) {
            System.out.println("пользователь не валидный");
        } catch (UserNotFoundException e) {
            System.out.println("пользователь не найден");
        }


    }
}
