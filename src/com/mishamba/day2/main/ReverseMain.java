package com.mishamba.day2.main;

import com.mishamba.day2.console.ReverseEcho;
import com.mishamba.day2.exception.ProgramException;
import com.mishamba.day2.validator.ArgsNotEmptyValidator;

class ReverseMain {
    public static void main(String[] args) throws ProgramException {
        ArgsNotEmptyValidator validator = new ArgsNotEmptyValidator();
        if (validator.empty(args)) {
            throw new ProgramException("argument requested");
        }
        ReverseEcho console = new ReverseEcho();
        console.reverseEcho(args);
    }
}
