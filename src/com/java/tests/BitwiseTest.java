package com.java.tests;

/**
 * Created by temo on 11/6/15.
 */
public class BitwiseTest {
    public static void main(String[] args) {
        byte a = 0b0000_0011; //a = 3 //byte is signed, that means first value
        // after 0b is used for plus or for minus **** all primitive types are signed is java,
        // only int and long can be used as unsigned
        byte b = (byte) (a >> 1); //b = 0b01
        byte c = (byte) (a << 1); //c = a * 2
        byte d = (byte) (a >>> 1); //d = 0b1
        byte e = (byte) (a & 1); //e = (0b11 & 0b01) = 0b01
        byte f = (byte) (a | 1); //f = (0b11 | 0b01) = 0b11
        byte g = (byte) (a ^ 1); //g = (0b11 ^ 0b01) = 0b10
        byte xByte = (byte) 0b1000_0000; //0b1000_0000 is int value in 2's, because it is
        // unsigned and byte can't be unsigned, so we cast unsigned int to signed byte
        byte maxByte = Byte.MAX_VALUE;
        byte minByte = Byte.MIN_VALUE;
        String byteType = Byte.TYPE.getSimpleName();
        System.out.println(byteType);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);
        System.out.println(g);
        System.out.println(xByte);
        System.out.println(maxByte);
        System.out.println(minByte);
    }
}
