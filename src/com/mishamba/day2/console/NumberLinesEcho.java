package com.mishamba.day2.console;

import java.util.Random;

public class NumberLinesEcho {
    public void numberLinesEcho(int oneLine, int newLine) {
        Random generator = new Random();
        for (int i = 0; i < oneLine; i++) {
            System.out.print(generator.nextInt() + " ");
        }

        System.out.print("\n");

        for (int i = 0; i <newLine; i++) {
            System.out.println(generator.nextInt());
        }
    }
}
