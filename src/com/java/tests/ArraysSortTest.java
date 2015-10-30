package com.java.tests;

import org.w3c.dom.css.Counter;

import java.math.BigDecimal;
import java.util.Arrays;

/**
 * Created by temo on 10/30/15.
 */
public class ArraysSortTest {
    public static void main(String[] args) {
        int[] arr = new int[11];
        int j = 10;
        for (int i = 0; i < arr.length; i++) {
           arr[i] = j--;
        }
        System.out.println(Arrays.toString(arr));

        double start = System.nanoTime();
        Arrays.sort(arr);
        double end = System.nanoTime();
        double result = end - start;

        System.out.println(Arrays.toString(arr));

        System.out.println("Time to sort numbers with quick sort algorithm: " + result + " nanoseconds.");
    }
}
