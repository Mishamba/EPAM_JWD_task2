package com.mishamba.day2.main;

import com.mishamba.day2.service.NumbersSumService;
import com.mishamba.day2.exception.ProgramException;
import com.mishamba.day2.validator.ArgsNotEmptyValidator;

class NumbersSumMain {
    public static void main(String[] args) throws ProgramException {
        ArgsNotEmptyValidator validator = new ArgsNotEmptyValidator();
        if (validator.empty(args)) {
            throw new ProgramException("no arguments given");
        }
        try {
            NumbersSumService service = new NumbersSumService();
            System.out.println(service.sumNumbers(args));
        } catch(NumberFormatException ex) {
            System.out.println("not numeric input");
        }
    }
}
