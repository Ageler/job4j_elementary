package ru.job4j.io;

import java.util.Scanner;

public class Matches {
    public static void main(String[] args) {
        int count = 11;
        int turn = 1;
        int select = 0;
        int temp = 0;
        Scanner sc = new Scanner(System.in);
        while (count > 0) {
            if(turn % 2 != 0) {
                System.out.println("Ходит первый игрок");
                select = Integer.valueOf(sc.nextLine());
            } else {
                System.out.println("Ходит второй игрок");
                select = Integer.valueOf(sc.nextLine());
            }
            if(select >= 1 && select <= 3) {
            count-=select;
            }
            System.out.println("Осталось " + count + " спичек");
            turn++;
        }
        if (turn % 2 != 0) {
            System.out.println("Победил второй игрок");
        } else {
            System.out.println("Победил первый игрок");
        }
    }
}
