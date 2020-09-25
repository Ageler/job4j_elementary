package ru.job4j.search;

import java.util.ArrayList;
import java.util.function.Predicate;

public class PhoneDictionary {
   public void whenFindByName() {}
    private ArrayList<Person> persons = new ArrayList<Person>();

    public void add(Person person) {
        this.persons.add(person);
    }

    /**
     * Вернуть список всех пользователей, который содержат key в любых полях.
     * @param key Ключ поиска.
     * @return Список подощедщих пользователей.
     */
    public ArrayList<Person> find(String key) {
        Predicate<Person> combineN = person -> person.getName().contains(key);
        Predicate<Person> combineA = person -> person.getAddress().contains(key);
        Predicate<Person> combineS = person -> person.getSurname().contains(key);
        Predicate<Person> combineP = person -> person.getPhone().contains(key);
        ArrayList<Person> result = new ArrayList<>();
        for (int i = 0; i < persons.size(); i++) {
           if(combineA.or(combineN).or(combineS).or(combineP).test(persons.get(i)) ) {
               result.add(persons.get(i));
           }
        }
        return result;
    }
}
