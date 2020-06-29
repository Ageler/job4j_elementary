package ru.job4j.loop;

public class Factorial {
    public static int calc(int n) {
        int result = 1;
        for (int factor = 2; factor <= n; factor++) {
            result *= factor;
        }
        return result;
    }
}
