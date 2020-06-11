package com.mishamba.day2.service;

public class PasswordCheck {
    private final String PASSWORD = "mishamba_gleck";
    public boolean passwordCheck(String password) {
        return (PASSWORD.equals(password));
    }
}
