package com.mishamba.day2.main;

import com.mishamba.day2.console.BirthdayEcho;
import com.mishamba.day2.service.BirthdayService;
import java.util.Calendar;
import java.util.GregorianCalendar;
import com.mishamba.day2.parser.StringsToNumbersParser;

class BirthdayMain {
    public static void main(String[] args) {
        BirthdayService service = new BirthdayService();
        StringsToNumbersParser parser = new StringsToNumbersParser();
        BirthdayEcho console = new BirthdayEcho();
        Calendar birthday = new GregorianCalendar(parser.parse(args[2]), parser.parse(args[1]), parser.parse(args[0]));
        boolean bornToday = service.isBirthday(birthday);
        console.congratulateIf(bornToday);
        int age = service.calculateFullYears(birthday);
        console.echoFullYears(age);
        int dayOfWeek = service.findDayOfWeek(birthday);
        console.echoDayOfWeek(dayOfWeek);
    }
}
