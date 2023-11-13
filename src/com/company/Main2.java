package com.company;

import java.util.HashSet;

public class Main2 {
    public static void main(String[] args) {
        HashSet<String> books = new HashSet<String>();
        books.add("Book1");
        books.add("Book2");
        books.add("Book3");
        books.add("Book4");
        books.add("Book5");
        books.contains("Book1");
        books.remove("Book2");
        books.size();
        System.out.println(books);
    }
}
