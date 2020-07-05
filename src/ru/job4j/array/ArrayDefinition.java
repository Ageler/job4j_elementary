package ru.job4j.array;

public class ArrayDefinition {
    public static void main(String[] args) {
        String[] names = new String[4];
        for (int i = 0; i < names.length; i++) {
           names[i] = "Petr Arsentev " + i;
        }
        for (String s: names
             ) {
            System.out.println(s);
        }
    }
}
