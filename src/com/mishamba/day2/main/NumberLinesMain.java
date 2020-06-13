package com.mishamba.day2.main;

import com.mishamba.day2.console.NumberLinesEcho;
import com.mishamba.day2.validator.ArgsNotEmptyValidator;
import com.mishamba.day2.exception.ProgramException;

class NumberLinesMain {
    public static void main(String[] args) {
        NumberLinesEcho console = new NumberLinesEcho();
        ArgsNotEmptyValidator validator = new ArgsNotEmptyValidator();
        if (!validator.empty(args)) {
            throw new ProgramEcxeption("no args given");
        }
        console.numberLinesEcho(Integer.parseInt(args[0])
                , Integer.parseInt(args[1]));
    }
}
