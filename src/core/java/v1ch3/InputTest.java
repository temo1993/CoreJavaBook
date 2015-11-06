package core.java.v1ch3;

/**
 @version 1.00 2000-01-07
 @author Cay Horstmann
 */

import javax.swing.*;

public class InputTest
{
    public static void main(String[] args)
    {
        // get first input
        String name = JOptionPane.showInputDialog
                ("What is your name?");

        // get second input
        String input = JOptionPane.showInputDialog
                ("How old are you?");

        // convert string to integer value
        int age = Integer.parseInt(input);

        // display output on console
        System.out.println("Hello, " + name +
                ". Next year, you'll be " + (age + 1));

        System.exit(0);
    }
}
