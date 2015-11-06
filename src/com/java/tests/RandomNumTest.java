package com.java.tests;

import java.util.Random;

/**
 * Created by temo on 11/6/15.
 */
public class RandomNumTest {
    public static void main(String[] args) {

    }
    static
    {
        final int countRandom = 26;
        Random generator = new Random();
        for (int j = 0; j < countRandom; j++) {
            int nextId = generator.nextInt(countRandom);
            System.out.print(nextId + " ");
        }
    }
    enum WeekDays{SUNDAY, MONDAY, TUESDAY, WEDNESDAY,
        THURSDAY, FRIDAY, SATURDAY };
}

