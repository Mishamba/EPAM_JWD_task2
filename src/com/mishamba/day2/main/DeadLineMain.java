package com.mishamba.day2.main;

import com.mishamba.day2.service.DeadLineService;
import com.mishamba.day2.entity.DeadLineInfo;
import com.mishamba.day2.parser.StringsToNumbersParser;

class DeadLineMain {
    public static void main(String[] args) {
        DeadLineService service = new DeadLineService();
        StringsToNumbersParser parser = new StringsToNumbersParser();
        DeadLineInfo result = service.findDeadLine(args[0], parser.parse(args[1]));
        System.out.println(result);
    }
}
