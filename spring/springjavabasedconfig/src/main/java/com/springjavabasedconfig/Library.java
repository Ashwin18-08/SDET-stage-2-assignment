package com.springjavabasedconfig;

public class Library {
    private final Book book;
    private final Printer printer;

    public Library(Book book, Printer printer) {
        this.book = book;
        this.printer = printer;
    }

    public void showLibrary() {
        book.display();
        printer.print("Library contains this book.");
    }
}
