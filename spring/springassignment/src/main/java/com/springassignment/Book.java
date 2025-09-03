package com.springassignment;


public class Book {
    private String title;

    public Book(String title) {
        this.title = title;
    }

    public void display() {
        System.out.println("Book: " + title);
    }
}
