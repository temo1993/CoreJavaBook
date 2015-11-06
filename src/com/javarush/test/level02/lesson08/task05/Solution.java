package com.javarush.test.level02.lesson08.task05;

/**
 * Created by temo on 11/3/15.
 */

/* Дублирование строки
Написать функцию, которая выводит переданную строку на экран три раза, каждый раз с новой строки.
*/
public class Solution
{
    public static void print3(String s)
    {
        System.out.println(s);//напишите тут ваш код
        System.out.println(s);//напишите тут ваш код
        System.out.println(s);//напишите тут ваш код

    }

    public static void main(String[] args)
    {
        print3("I love you!");
    }
}