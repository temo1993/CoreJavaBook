package core.java.v1ch3;

/**
 @version 1.10 1999-12-17
 @author Cay Horstmann
 */

import java.text.*;
import javax.swing.*;

public class Retirement2
{
    public static void main(String[] args)
    {
        String input = JOptionPane.showInputDialog
                ("How much money will you contribute every year?");
        double payment =  Double.parseDouble(input);

        input = JOptionPane.showInputDialog
                ("Interest rate in %:");
        double interestRate =  Double.parseDouble(input);

        double balance = 0;
        int year = 0;

        NumberFormat formatter
                = NumberFormat.getCurrencyInstance();

        // update account balance while user isn't ready to retire
        do
        {
            // add this year's payment and interest
            balance += payment;
            double interest = balance * interestRate / 100;
            balance += interest;

            year++;

            // print current balance
            System.out.println("After year " + year
                    + ", your balance is "
                    + formatter.format(balance));

            // ask if ready to retire and get input
            input = JOptionPane.showInputDialog
                    ("Ready to retire? (Y/N)");
            input = input.toUpperCase();
        }
        while (input.equals("N"));

        System.exit(0);
    }
}
