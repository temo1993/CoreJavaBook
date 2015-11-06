package core.java.v1ch3;

/**
 @version 1.10 1999-12-17
 @author Cay Horstmann
 */

import javax.swing.*;

public class Retirement
{
    public static void main(String[] args)
    {
        // read inputs
        String input = JOptionPane.showInputDialog
                ("How much money do you need to retire?");
        double goal = Double.parseDouble(input);

        input = JOptionPane.showInputDialog
                ("How much money will you contribute every year?");
        double payment =  Double.parseDouble(input);

        input = JOptionPane.showInputDialog
                ("Interest rate in %:");
        double interestRate =  Double.parseDouble(input);

        double balance = 0;
        int years = 0;

        // update account balance while goal isn't reached
        while (balance < goal)
        {
            // add this year's payment and interest

            balance += payment;
            double interest = balance * interestRate / 100;
            balance += interest;
            years++;
        }

        System.out.println
                ("You can retire in " + years + " years.");
        System.exit(0);
    }
}

