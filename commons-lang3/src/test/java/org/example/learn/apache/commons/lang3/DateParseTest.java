package org.example.learn.apache.commons.lang3;

import org.apache.commons.lang3.time.DateUtils;
import org.junit.Test;

import java.text.ParseException;
import java.util.Date;

public class DateParseTest {

    @Test
    public void test0() throws ParseException {
        String datePattern = "yyyy-MM-dd";
        String dateStr = "2022-08-02";
        Date date = DateUtils.parseDate(dateStr, datePattern);
        System.out.println(date);
    }

    @Test
    public void test1() throws ParseException {
        String datePattern = "yy年MM月dd日";
        String dateStr = "22年08月02日";
        Date date = DateUtils.parseDate(dateStr, datePattern);
        System.out.println(date);
    }
}
