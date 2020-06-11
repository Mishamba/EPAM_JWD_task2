package com.mishamba.day2.main;

import com.mishamba.day2.console.NumberLinesEcho;

class NumberLinesMain {
    public static void main(String[] args) {
        NumberLinesEcho console = new NumberLinesEcho();
        console.numberLinesEcho(Integer.parseInt(args[0])
                , Integer.parseInt(args[1]));
    }
}
