package com.springjavabasedconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfig {

    @Bean
    public Book book() {
        return new Book("Learning Spring Essentials");
    }

    @Bean
    public Printer printer() {
        Printer printer = new Printer();
        printer.setFormat("INFO");
        return printer;
    }

    @Bean
    public Library library(Book book, Printer printer) {
        return new Library(book, printer);
    }
}
