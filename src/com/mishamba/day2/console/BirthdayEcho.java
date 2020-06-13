package com.mishamba.day2.console;

public class BirthdayEcho {
    public void congratulateIf(boolean bornToday) {
        if (bornToday) {
            System.out.println("my congratulations");
        } else {
            System.out.println("your birthday is not today");
        }
    }

    public void echoFullYears(int years) {
        System.out.printf("u are %1d years old\n", years);
    }

    public void echoDayOfWeek(int dayOfWeek) {
        String day = nameOfDay(dayOfWeek);
        System.out.printf("u born on %1s\n", day);
    }

    private String nameOfDay(int dayOfWeek) {
        String name = "";
        switch (dayOfWeek) {
            case 2:
                name = "Monday";
                break;
            case 3:
                name = "Tuesday";
                break;
            case 4:
                name = "Wednesday";
                break;
            case 5:
                name = "Thursday";
                break;
            case 6:
                name = "Friday";
                break;
            case 7:
                name = "Saturday";
                break;
            case 1:
                name = "Sunday";
                break;
        }

        return name;
    }
}
