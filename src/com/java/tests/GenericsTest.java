package com.java.tests;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class GenericsTest {

    //Convert array to array list
    <T> void fromArrayToCollection(T[] a, Collection<T> c) {
        Collections.addAll(c, a);
    }

    public static void main(String[] args) {
        String arr[] = {"1","2","3","One","Two","Three"};
        GenericsTest genericsTest = new GenericsTest();
        Collection<String> collection = new ArrayList<>();
        genericsTest.fromArrayToCollection(arr,collection);
        System.out.println(collection);
//        int b = 15, a = 10;
//        b = b + a;
//        a = b - a;
//        b = b - a;
    }
}
