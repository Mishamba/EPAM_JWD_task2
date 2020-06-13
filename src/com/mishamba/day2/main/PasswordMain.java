package com.mishamba.day2.main;

import com.mishamba.day2.service.PasswordCheck;
import com.mishamba.day2.exception.ProgramException;
import com.mishamba.day2.validator.ArgsNotEmptyValidator;

class PasswordMain {
    public static void main(String[] args)  throws ProgramException {
        ArgsNotEmptyValidator validator = new ArgsNotEmptyValidator();
        if (!validator.countOfArgs(args, 1)) {
            throw new ProgramException("need one argument");
        }
        PasswordCheck service = new PasswordCheck();
        boolean correctPassword = service.passwordCheck(args[0]);
        System.out.println(correctPassword);
    }
}
