package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book[] books = new Book[4];
        books[0] = new Book("Clean code", 100);
        for (int i = 1; i < books.length; i++) {
            books[i] = new Book("Book " + i, 100 + i);
        }
        for (Book b: books
             ) {
            System.out.println(b.getName());
        }
        Book temp = books[0];
        books[0] = books[3];
        books[3] = temp;
        for (Book b: books
        ) {
            System.out.println(b.getName());
        }
    }
}
