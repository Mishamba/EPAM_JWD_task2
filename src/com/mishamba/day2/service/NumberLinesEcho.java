package com.mishamba.day2.service;

import java.util.Random;
import java.util.ArrayList;

public class NumberLinesEcho {
    public void numberLinesEcho(int count) {
        Random generator = new Random();
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            result.add(generator.nextInt());
        }
    }
}
