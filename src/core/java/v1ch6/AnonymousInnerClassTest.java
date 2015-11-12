package core.java.v1ch6;

/**
 @version 1.00 2000-04-13
 @author Cay Horstmann
 */

import java.awt.event.*;
import java.text.*;
import javax.swing.*;

public class AnonymousInnerClassTest
{
    public static void main(String[] args)
    {
        // construct a bank account with initial balance of $10,000
        BankAccount1 account = new BankAccount1(10000);
        // start accumulating interest at 10%
        account.start(10);

        // keep program running until user selects "Ok"
        JOptionPane.showMessageDialog(null, "Quit program?");
        System.exit(0);
    }
}

class BankAccount1
{
    /**
     Constructs a bank account with an initial balance
     @param initialBalance the initial balance
     */
    public BankAccount1(double initialBalance)
    {
        balance = initialBalance;
    }

    /**
     Starts a simulation in which interest is added once per
     second
     @param rate the interest rate in percent
     */
    public void start(final double rate)
    {
        ActionListener adder = new
                ActionListener()
                {
                    public void actionPerformed(ActionEvent event)
                    {
                        // update interest
                        double interest = balance * rate / 100;
                        balance += interest;

                        // print out current balance
                        NumberFormat formatter
                                = NumberFormat.getCurrencyInstance();
                        System.out.println("balance="
                                + formatter.format(balance));
                    }
                };

        Timer t = new Timer(1000, adder);
        t.start();
    }

    private double balance;
}

