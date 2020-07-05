package ru.job4j.loop;

public class Mortgage {
    public static int year(int amount, int salary, double percent) {
        int year = 0;
        double sum = amount;
        while (sum > 0) {
            sum = (amount * (percent / 100)) - salary + amount;
            year++;
        }
        return year;
    }
}
