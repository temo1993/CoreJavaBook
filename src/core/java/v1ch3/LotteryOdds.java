package core.java.v1ch3;

/**
 @version 1.10 1999-12-17
 @author Cay Horstmann
 */

import javax.swing.*;

public class LotteryOdds
{
    public static void main(String[] args)
    {
        String input = JOptionPane.showInputDialog
                ("How many numbers do you need to draw?");
        int k = Integer.parseInt(input);

        input = JOptionPane.showInputDialog
                ("What is the highest number you can draw?");
        int n = Integer.parseInt(input);

      /*
         compute binomial coefficient
         n * (n - 1) * (n - 2) * . . . * (n - k + 1)
         -------------------------------------------
         1 * 2 * 3 * . . . * k
      */

        int lotteryOdds = 1;
        for (int i = 1; i <= k; i++)
            lotteryOdds = lotteryOdds * (n - i + 1) / i;

        System.out.println
                ("Your odds are 1 in " + lotteryOdds + ". Good luck!");

        System.exit(0);
    }
}

