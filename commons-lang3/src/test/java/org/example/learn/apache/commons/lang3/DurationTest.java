package org.example.learn.apache.commons.lang3;

import org.apache.commons.lang3.time.DurationFormatUtils;
import org.junit.Before;
import org.junit.Test;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DurationTest {

    private DateFormat dateFormat;
    Date date1;
    Date date2;

    @Test
    public void test0() throws ParseException {
        dateFormat = new SimpleDateFormat("yyyyMMdd hh:mm:ss");
        date1 = dateFormat.parse("20260804 10:02:02");
        date2 = dateFormat.parse("20260804 10:05:05");
        System.out.println("date1 = " + date1);
        System.out.println("date2 = " + date2);


        String formatDuration = DurationFormatUtils.formatDuration(date2.getTime() - date1.getTime(), "yyyy-MM-dd HH:mm:ss");
        System.out.println("formatDuration = " + formatDuration);
    }

    /**
     * durationMillis必须是正数
     */
    @Test(expected = IllegalArgumentException.class)
    public void test1() throws ParseException {
        dateFormat = new SimpleDateFormat("yyyyMMdd hh:mm:ss");
        date1 = dateFormat.parse("20260804 10:02:02");
        date2 = dateFormat.parse("20260804 10:05:05");
        System.out.println("date1 = " + date1);
        System.out.println("date2 = " + date2);


        String formatDuration = DurationFormatUtils.formatDuration(date1.getTime() - date2.getTime(), "yyyy-MM-dd HH:mm:ss");
        System.out.println("formatDuration = " + formatDuration);
    }

    /**
     * 只计算到 日/小时/分钟/秒, 不会自动将日转换为月/年
     * @throws ParseException
     */
    @Test
    public void test2() throws ParseException {
        dateFormat = new SimpleDateFormat("yyyyMMdd hh:mm:ss");
        date1 = dateFormat.parse("20260227 10:02:02");
        date2 = dateFormat.parse("20270226 10:05:05");
        System.out.println("date1 = " + date1);
        System.out.println("date2 = " + date2);


        String formatDuration = DurationFormatUtils.formatDuration(date2.getTime() - date1.getTime(), "yyyy-MM-dd HH:mm:ss");
        System.out.println("formatDuration = " + formatDuration);
    }
}
