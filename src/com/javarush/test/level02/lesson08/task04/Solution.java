package com.javarush.test.level02.lesson08.task04;

/**
 * Created by temo on 11/3/15.
 */
/* Минимум четырех чисел
Написать функцию, которая вычисляет минимум из четырёх чисел.
Функция min(a,b,c,d) должна использовать (вызывать) функцию min(a,b)
Подсказка:
Нужно написать тело обеих существующих функций min и исправить их возвращаемые значения.
*/
public class Solution
{
    public static int min(int a, int b, int c, int d)
    {
        min(c,d);//напишите тут ваш код
          if(c < a && c < b)
            return c;
           else if(d < a && d < b)
          return d;
        else
              return min(a,b);
    }

    public static int min(int a, int b)
    {
        if(a < b)
            return a;
        else
            return b;//напишите тут ваш код

    }

    public static void main(String[] args) throws Exception
    {
        System.out.println( min(-20, -101) );
        System.out.println( min(-20, -10, -309, -40) );
        System.out.println( min(-202, -10, -30, 40) );
    }
}
