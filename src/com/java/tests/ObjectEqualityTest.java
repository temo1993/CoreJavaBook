package com.java.tests;

/**
 * @version 1.0 11/7/15.
 * @author temo
 */
public class ObjectEqualityTest {
    public static void main(String[] args) {
        System.out.println();
        String first = "15";
        String second = "15";
        System.out.println(first.hashCode());
        System.out.println(second.hashCode());
        System.out.println(second == first);
        System.out.println(second.equals(first));
        first = new String("15");
        System.out.println(first.hashCode());
        System.out.println(second.hashCode());
        System.out.println(second == first);
        System.out.println(second.equals(first));
    }
}
