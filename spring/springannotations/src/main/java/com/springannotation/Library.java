package com.springannotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Library {

    private Book book;
    private Printer printer;

    //setter injection

    @Autowired
    public void setBook(Book book) {
        this.book = book;
    }

    @Autowired
    public void setPrinter(Printer printer) {
        this.printer = printer;
    }

    public void showLibrary() {
        book.display();
        printer.print("Library contains this book.");
    }
}
