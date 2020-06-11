package com.mishamba.day2.main;

import com.mishamba.day2.service.PasswordCheck;

class PasswordMain {
    public static void main(String[] args) {
        PasswordCheck service = new PasswordCheck();
        boolean correctPassword = service.passwordCheck(args[0]);
        System.out.println(correctPassword);
    }
}
