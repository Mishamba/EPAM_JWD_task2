package com.mishamba.day2.validator;

public class ArgsNotEmptyValidator {
    public boolean empty(String[] args) {
        return (args.length != 0);
    }
}
