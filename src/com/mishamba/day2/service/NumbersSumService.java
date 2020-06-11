package com.mishamba.day2.service;

import com.mishamba.day2.parser.StringsToNumbersParser;

public class NumbersSumService {
    public int sumNumbers(String[] array) {
        StringsToNumbersParser parser = new StringsToNumbersParser();
        int result = 0;
        for (String elem : array) {
            result += parser.parse(elem);
        }

        return result;
    }
}
