package com.springjavabasedconfig;

public class Book {
    private final String title;

    public Book(String title) {
        this.title = title;
    }

    public void display() {
        System.out.println("Book: " + title);
    }
}