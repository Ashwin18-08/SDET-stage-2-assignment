package com.springassignment;

public class Printer {
    private String format;

    public void setFormat(String format) {
        this.format = format;
    }

    public void print(String message) {
        System.out.println("[" + format + "] " + message);
    }
}
