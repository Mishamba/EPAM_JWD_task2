package com.mishamba.day2.validator;

public class NegativeNumbersValidator {
    public boolean isNegative(int number) {
        return ((number > 0) && (number < 20));
    }
}
