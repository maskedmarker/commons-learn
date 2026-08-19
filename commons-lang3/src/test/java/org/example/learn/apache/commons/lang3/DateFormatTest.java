package org.example.learn.apache.commons.lang3;

import org.apache.commons.lang3.time.DateFormatUtils;
import org.junit.Test;

import java.util.Date;

public class DateFormatTest {

    @Test
    public void test0() {
        Date now = new Date();
        String formattedDate = DateFormatUtils.format(now, "yyyy年MM月dd日HH:mm:ss");
        System.out.println(formattedDate);
    }

    @Test
    public void test1() {
        Date now = new Date();
        String formattedDate = DateFormatUtils.format(now, "yy年MM月dd日HH时mm分ss秒");
        System.out.println(formattedDate);
    }

    @Test(expected = NullPointerException.class)
    public void test3() {
        Date now = null;
        String formattedDate = DateFormatUtils.format(now, "yyyy年MM月dd日HH:mm:ss");
        System.out.println(formattedDate);
    }
}
