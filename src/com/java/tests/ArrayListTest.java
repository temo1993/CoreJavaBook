package com.java.tests;

import java.util.ArrayList;

/**
 * Created by temo on 11/5/15.
 *
 */
public class ArrayListTest {
    public static void main(String[] args) {
        int elementIndex = 10;
        ArrayList<String> strings = new ArrayList<>();
        for (int i = 0;i<10;i++) {
            strings.add("a");
            strings.add("b");
            strings.add("c");
            strings.add("d");
        }
        System.out.println(strings);
        System.out.println(strings.size());
        System.out.println(strings.indexOf("b"));
        System.out.println(strings.contains("b"));
        System.out.println(strings.get(elementIndex));

        System.out.print("After removed element on position " + elementIndex + " is: --- ");
        System.out.println(strings.remove(elementIndex));
        System.out.println(strings);
        System.out.println(strings.size());

        strings.trimToSize();
        System.out.println("after trim length");
        System.out.println(strings);
        System.out.println(strings.size());
    }
}
