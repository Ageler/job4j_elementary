package ru.job4j.sort;

import java.util.Arrays;

public class Machine {
    private final int[] cOINS = {10, 5, 2, 1};

    public int[] change(int money, int price) {
        int[] rsl = new int[100];
        int size = 0;
        while (money > 0) {
            money -= price;
            for (int i = 0; i < cOINS.length; i++) {
                if (money - cOINS[i] >= 0) {
                    money -= cOINS[i];
                    rsl[size] = cOINS[i];
                    size++;
                    i--;
                }
            }
        }
        return Arrays.copyOf(rsl, size);
    }
}
