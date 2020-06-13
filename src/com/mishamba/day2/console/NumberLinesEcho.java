package com.mishamba.day2.console;

import java.util.ArrayList;

public class NumberLinesEcho {
    public void echoInLine(ArrayList<Integer> numbers) {
        for (Integer number : numbers) {
            System.out.print(number + " ");
        }
    }

    public void echoWithNewLine(ArrayList<Integer> numbers) {
        for (Integer number : numbers) {
            System.out.println(number);
        }
    }
}
