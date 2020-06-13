package com.mishamba.day2.main;

import com.mishamba.day2.service.GenerateNumbers;
import com.mishamba.day2.validator.ArgsNotEmptyValidator;
import com.mishamba.day2.exception.ProgramException;
import com.mishamba.day2.console.NumberLinesEcho;
import com.mishamba.day2.parser.StringsToNumbersParser;
import java.util.ArrayList;

class NumberLinesMain {
    public static void main(String[] args) throws ProgramException {
        GenerateNumbers service = new GenerateNumbers();
        NumberLinesEcho console = new NumberLinesEcho();
        StringsToNumbersParser parser = new StringsToNumbersParser();
        ArgsNotEmptyValidator validator = new ArgsNotEmptyValidator();
        if (!validator.countOfArgs(args, 2)) {
            throw new ProgramException("not enought args");
        }
        ArrayList<Integer> oneLineNumbers = service.generate(parser.parse(args[0]));
        ArrayList<Integer> newLineNumbers = service.generate(parser.parse(args[1]));
        console.echoInLine(oneLineNumbers);
        console.echoWithNewLine(newLineNumbers);
    }
}
