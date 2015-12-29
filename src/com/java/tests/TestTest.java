package com.java.tests;

import java.util.ArrayList;
import java.util.List;

public class TestTest {
    public static void main(String[] args) {
        String s1 = new String();
        String s2 = new String();
        System.out.println("1" + s1 + "1" + s2);
        System.out.println(s1.equals(s2));
        ArrayList list = new ArrayList();
        list.add(4);
        list.add("4");
        System.out.println(list);

        String a = "";
        a += 2;
        a += 'c';
        a += false;
        if ( a == "2cfalse") System.out.println("==");
        if ( a.equals("2cfalse")) System.out.println("equals");


        String s = "purr";
        s.toUpperCase();
        s.trim();
        s.substring(1, 3);
        s += " two";
        System.out.println(s.length());
    }
}

