package com.springannotation;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


@Component
public class Printer {
    private String format;

    @Value("INFO")
    public void setFormat(String format) {
        this.format = format;
    }

    public void print(String message) {
        System.out.println("[" + format + "] " + message);
    }
}
