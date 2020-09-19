package ru.job4j.ex;

public class ElementNotFoundException extends Throwable {
    public static int indexOf(String[] value, String key) throws ElementNotFoundException {
        int rsl = -1;
        for (int i = 0; i < value.length; i++) {
            if (value[i] == key) {
                rsl = i;
            }
        }
        if (rsl == -1) {
            throw new ElementNotFoundException();
        }
        return rsl;
    }

    public static void main(String[] args) {
        String[] arr = {"1", "2", "3"};
        try {
            indexOf(arr, "2");
        } catch (ElementNotFoundException e) {
            e.printStackTrace();
        }

    }
}
