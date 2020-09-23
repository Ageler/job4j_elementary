package ru.job4j.collection;

import java.util.HashMap;
import java.util.Map;

public class UsageMap {
    public static void main(String[] args) {
        HashMap<String, String> persons = new HashMap<>();
        persons.put("somebody@gmail.com", "Andrew Borchenko");
        persons.put("parsentev@yandex.ru", "Petr Arsentev");
        for (String key: persons.keySet()
             ) {
            System.out.println(key);
        }
    }
}
