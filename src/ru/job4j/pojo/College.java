package ru.job4j.pojo;

public class College {

    public static void main(String[] args) {
        Student mike = new Student();
        mike.setDate("4.08.1999");
        mike.setFullName("Mikel Collson");
        mike.setGroup(10);
        mike.output();
    }
}
