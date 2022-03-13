package com.bytelegend;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MaxValuesTest {
    @Test
    public void test() {
        Assertions.assertEquals(Byte.MAX_VALUE, MaxValues.maxByte);
        Assertions.assertEquals(Short.MAX_VALUE, MaxValues.maxShort);
        Assertions.assertEquals(Integer.MAX_VALUE, MaxValues.maxInt);
        Assertions.assertEquals(Long.MAX_VALUE, MaxValues.maxLong);
        Assertions.assertEquals(Float.MAX_VALUE, MaxValues.maxFloat);
        Assertions.assertEquals(Double.MAX_VALUE, MaxValues.maxDouble);
        Assertions.assertEquals(Character.MAX_VALUE, MaxValues.maxChar);
    }
}
