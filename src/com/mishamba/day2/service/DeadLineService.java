package com.mishamba.day2.service;

import java.util.Calendar;
import com.mishamba.day2.entity.DeadLineInfo;
import com.mishamba.day2.validator.DateRangeValidator;
import com.mishamba.day2.exception.ProgramException;

public class DeadLineService {
    public DeadLineInfo findDeadLine(String developer, int days) throws ProgramException {
        DateRangeValidator validator = new DateRangeValidator();
        if (!validator.isDayCorrect(days)) {
            throw new ProgramException("days not in range");
        }
        Calendar deadline = Calendar.getInstance();
        deadline.roll(Calendar.DAY_OF_YEAR, days);
        DeadLineInfo result = new DeadLineInfo(deadline, developer);
        return result;
    }
}
