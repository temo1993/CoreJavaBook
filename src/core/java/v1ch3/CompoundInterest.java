package core.java.v1ch3;

/**
 @version 1.30 1999-12-16
 @author Cay Horstmann
 */

import java.text.*;
import javax.swing.*;

public class CompoundInterest
{
    public static void main(String[] args)
    {
        final int STARTRATE = 10;
        final int NRATES = 6;
        final int NYEARS = 10;

        // set interest rates to 10 . . . 15%
        double[] interestRate = new double[NRATES];
        for (int j = 0; j < interestRate.length; j++)
            interestRate[j] = (STARTRATE + j) / 100.0;

        double[][] balance = new double[NYEARS][NRATES];

        // set initial balances to 10000
        for (int j = 0; j < balance[0].length; j++)
            balance[0][j] = 10000;

        // compute interest for future years

        for (int i = 1; i < balance.length; i++)
        {
            for (int j = 0; j < balance[i].length; j++)
            {
                // get last year's balance from previous row
                double oldBalance = balance[i - 1][j];

                // compute interest
                double interest = oldBalance * interestRate[j];

                // compute this year's balance
                balance[i][j] = oldBalance + interest;
            }
        }

        // print one row of interest rates

        NumberFormat formatter = NumberFormat.getPercentInstance();

        for (int j = 0; j < interestRate.length; j++)
        {
            System.out.print("        ");
            System.out.print(formatter.format(interestRate[j]));
        }
        System.out.println();

        // print balance table

        formatter = NumberFormat.getCurrencyInstance();

        for (int i = 0; i < balance.length; i++)
        {
            // print table row
            for (int j = 0; j < balance[i].length; j++)
            {
                System.out.print(" ");
                System.out.print(formatter.format(balance[i][j]));
            }
            System.out.println();
        }
    }
}
