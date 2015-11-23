package com.java.tests;

import java.util.Arrays;

public class MemoryTest {
    public static void main(String[] args) {
        for (int i = Integer.MIN_VALUE; i < Integer.MAX_VALUE; i++) {
            String arr[] = new String[Integer.MAX_VALUE]; // java.lang.OutOfMemoryError
            System.out.println(Arrays.toString(arr));
            //   System.out.println(new Long(Long.MAX_VALUE));
        }
        System.gc();
    }
}
