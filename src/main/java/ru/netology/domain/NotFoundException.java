package ru.netology.domain;

public class NotFoundException extends Exception {
    public NotFoundException(String msg) {
        super(msg);
        System.out.println(msg);
    }
}
