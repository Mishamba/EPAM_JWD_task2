package com.mishamba.day2.service;

import java.util.Calendar;
import com.mishamba.day2.exception.ProgramException;
import com.mishamba.day2.validator.DateRangeValidator;

public class BirthdayService {
    public boolean isBirthday(Calendar birthday) throws ProgramException {
        Calendar today = Calendar.getInstance();
        boolean equalDays = (today.get(Calendar.DAY_OF_MONTH) == 
                birthday.get(Calendar.DAY_OF_MONTH));
        boolean equalMonth = (today.get(Calendar.DAY_OF_MONTH) == 
                birthday.get(Calendar.DAY_OF_MONTH));
        return (equalDays && equalMonth);
    }

    public int calculateFullYears(Calendar birthday) {
        int age = Calendar.getInstance().get(Calendar.YEAR) - birthday.get(Calendar.YEAR);
        if (Calendar.getInstance().get(Calendar.DAY_OF_YEAR) < birthday.get(Calendar.DAY_OF_YEAR)) {
            age--;
        }

        return age;
    }

    public int findDayOfWeek(Calendar birthday) {
        return birthday.get(Calendar.DAY_OF_WEEK);
    }
}
