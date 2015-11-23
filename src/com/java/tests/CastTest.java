package com.java.tests;


public class CastTest {
    public static void main(String[] args) {
        byte x = 10;
        byte y = 15;
       // short z = x + y; // wrong! x + y returns int value so cast needed
       // byte z = x + y; // wrong! x + y returns int value so cast needed
        short z = (short)(x + y);

        // floating point value test
        // float fWrong = 13.0; // wrong 13.0 is double.To be float it needs f letter at the end i.e : 13.0f
        float fRight = 13.0F;
        float f = 13; // no need f at the end ...no floating value...whole number...
        float s = fRight + x;
        System.out.println(s + f);
    }
}
