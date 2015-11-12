package core.java.v1ch5;

/**
 @version 1.00 1997-03-11
 @author Cay Horstmann
 */

import java.lang.reflect.*;
import java.text.*;

public class MethodPointerTest
{
    public static void main(String[] args) throws Exception
    {
        // get method pointers to the square and sqrt methods
        Method square = MethodPointerTest.class.getMethod("square",
                new Class[] { double.class });
        Method sqrt = java.lang.Math.class.getMethod("sqrt",
                new Class[] { double.class });

        // print tables of x- and y-values

        printTable(1, 10, 10, square);
        printTable(1, 10, 10, sqrt);
    }

    /**
     Returns the square of a number
     @param x a number
     @return x squared
     */
    public static double square(double x)
    {
        return x * x;
    }

    /**
     Prints a table with x- and y-values for a method
     @param from the lower bound for the x-values
     @param to the upper bound for the x-values
     @param n the number of rows in the table
     @param f a method with a double parameter and double
     return value
     */
    public static void printTable(double from, double to,
                                  int n, Method f)
    {
        // print out the method as table header
        System.out.println(f);

        // construct formatter to print with 4 digits precision

        NumberFormat formatter = NumberFormat.getNumberInstance();
        formatter.setMinimumFractionDigits(4);
        formatter.setMaximumFractionDigits(4);
        double dx = (to - from) / (n - 1);

        for (double x = from; x <= to; x += dx)
        {
            // print x-value
            String output = formatter.format(x);
            // pad with spaces to field width of 10
            for (int i = 10 - output.length(); i > 0; i--)
                System.out.print(' ');
            System.out.print(output + " |");

            try
            {
                // invoke method and print y-value
                Object[] args = { new Double(x) };
                Double d = (Double)f.invoke(null, args);
                double y = d.doubleValue();

                output = formatter.format(y);
                // pad with spaces to field width of 10
                for (int i = 10 - output.length(); i > 0; i--)
                    System.out.print(' ');

                System.out.println(output);
            }
            catch (Exception e) {  e.printStackTrace(); }
        }
    }
}

