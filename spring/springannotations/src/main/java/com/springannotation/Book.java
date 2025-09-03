package com.springannotation;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Book {
    private String title;

    public Book(@Value("Spring Framework Essentials") String title) {
        this.title = title;
    }

    public void display() {
        System.out.println("Book: " + title);
    }
}