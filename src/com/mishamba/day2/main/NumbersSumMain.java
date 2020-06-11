package com.mishamba.day2.main;

import com.mishamba.day2.service.NumbersSumService;

class NumbersSumMain {
    public static void main(String[] args) {
        NumbersSumService service = new NumbersSumService();
        System.out.println(service.sumNumbers(args));
    }
}
