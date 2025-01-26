package org.example.learn.apache.commons.lang3;

import org.apache.commons.lang3.ObjectUtils;
import org.junit.Test;

public class DefaultValueTest {

    @Test
    public void test0() {
        String param1 = "hello";
        String param2 = null;
        String defaultValue = "this is a default value";

        String value1 = ObjectUtils.defaultIfNull(param1, defaultValue);
        System.out.println("value1 = " + value1);

        String value2 = ObjectUtils.defaultIfNull(param2, defaultValue);
        System.out.println("value2 = " + value2);
    }
}
