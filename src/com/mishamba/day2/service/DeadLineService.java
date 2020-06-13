package com.mishamba.day2.service;

import java.util.Calendar;
import com.mishamba.day2.entity.DeadLineInfo;

public class DeadLineService {
    public DeadLineInfo findDeadLine(String developer, int days) {
        Calendar deadline = Calendar.getInstance();
        deadline.roll(Calendar.DAY_OF_YEAR, days);
        DeadLineInfo result = new DeadLineInfo(deadline, developer);
        return result;
    }
}
