package com.springassignment;

public class Library {
    private Book book;
    private Printer printer;

    public void setBook(Book book) {
        this.book = book;
    }

    public void setPrinter(Printer printer) {
        this.printer = printer;
    }

    public void showLibrary() {
        book.display();
        printer.print("Library contains this book.");
    }
}
