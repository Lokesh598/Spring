package com.example.springdemo.beans;

public class Wisher {
    private String message;
    public Wisher() {}
    public Wisher(String message) {
        this.message = message;
    }
    public void setMessage(String message) {
        this.message = message;
    }
    public String getMessage() {
        return message;
    }
}
