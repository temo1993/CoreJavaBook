package com.javarush.test.level02.lesson08.task06;

/**
 * Created by temo on 11/3/15.
 */
/* Вывод текста на экран
Написать функцию, которая выводит переданную строку (слово) на экран три раза, но в одной строке.
Слова должны быть разделены пробелом и не должны сливаться в одно.
*/
public class Solution
{
    public static void print3(String s)
    {
        System.out.println(s + " " + s + " " + s);

    }
    public static void main(String[] args)
    {
        print3("window");
        print3(" file");
    }
}