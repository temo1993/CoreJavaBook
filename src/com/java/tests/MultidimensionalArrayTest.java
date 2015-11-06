package com.java.tests;

import java.lang.reflect.Array;
import java.nio.charset.Charset;
import java.util.Arrays;

/**
 * Created by temo on 10/31/15.
 */
public class MultidimensionalArrayTest {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3,4,5}}; //=== int[][] arr = new int[0][5];
        int[][] arrSame = new  int[1][5];
        arrSame[0][0] = 1;
        arrSame[0][1] = 2;
        arrSame[0][2] = 3;
        arrSame[0][3] = 4;
        arrSame[0][4] = 5;

        System.out.println(Arrays.deepToString(arrSame));
        System.out.println(Arrays.deepToString(arr));

//        arrSame[1][0] = 1;
//        arrSame[1][1] = 2;
//        arrSame[1][2] = 3;
//        arrSame[1][3] = 4;
//        arrSame[1][4] = 5;
        char[] charArr = new char[5];
            char i = 33; //output is !!!!! //char is visible from 32(to Character.MAX_VALUE;), 32 == " " blank space
            charArr[0] = i;
            charArr[1] = i;
            charArr[2] = i;
            charArr[3] = i;
            charArr[4] = i;
        System.out.println(charArr);


        /*A “for each” loop does not automatically loop through all elements in a two-dimensional array.
        Instead, it loops through the rows, which are themselves one-dimensional arrays.
        To visit all elements of a two-dimensional array a, nest two loops, like this:*/
        double[][] a = {{10,20,30,40,50},{20,40,60,80,100},{40,80,120,160,200},{80,160,240,320,400}};
        for (double[] row : a){
            System.out.println();
            for (double value : row){
                System.out.print(value + " ");
            }
        }

    }
}

