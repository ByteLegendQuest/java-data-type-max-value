package com.bytelegend;
public class MaxValues {
    // byte类型能存储的最大值是？
    // The maximum value a byte type can store
    public static byte maxByte = 127;

    // short类型能存储的最大值是？
    // The maximum value a short type can store
    public static short maxShort = 32767;

    // int类型能存储的最大值是？
    // The maximum value an int type can store
    public static int maxInt = 2147483647;

    // long类型能存储的最大值是？
    // The maximum value an long type can store
    public static long maxLong = 9223372036854775807;

    // float类型能存储的最大值是？
    // The maximum value an float type can store
    public static float maxFloat = 340282346638528860000000000000000000000;

    // double类型能存储的最大值是？
    // The maximum value an double type can store
    public static double maxDouble = 179769313486231570814527423731704356798070567525844996598917476803157260780028538760589558632766878171540458953514382464234321326889464182768467546703537516986049910576551282076245490090389328944075868508455133942304583236903222948165808559332123348274797826204144723168738177180919299881250404026184124858368;

    // char类型能存储的最大值是？
    // The maximum value an char type can store
    public static char maxChar = 65535;

    public static void main(String[] args) {
        System.out.println("maxByte=" + maxByte);
        System.out.println("maxByte+1=" + (maxByte + 1));
        System.out.println("maxShort=" + maxShort);
        System.out.println("maxShort+1=" + (maxShort + 1));
        System.out.println("maxInt=" + maxInt);
        System.out.println("maxInt+1=" + (maxInt + 1));
        System.out.println("maxLong=" + maxLong);
        System.out.println("maxLong+1=" + (maxLong + 1));
        System.out.println("maxFloat=" + maxFloat);
        System.out.println("maxFloat+1=" + (maxFloat + 1));
        System.out.println("maxDouble=" + maxDouble);
        System.out.println("maxDouble+1=" + (maxDouble + 1));
        System.out.println("maxChar=" + maxChar);
        System.out.println("maxChar+1=" + (maxChar + 1));
    }
}
