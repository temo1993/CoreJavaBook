package core.java.v1ch3;

/**
 @version 1.10 1999-12-16
 @author Cay Horstmann
 */

public class LotteryArray
{
    public static void main(String[] args)
    {
        final int NMAX = 10;

        // allocate triangular array
        int[][] odds = new int[NMAX + 1][];
        for (int n = 0; n <= NMAX; n++)
            odds[n] = new int[n + 1];

        // fill triangular array
        for (int n = 0; n < odds.length; n++)
            for (int k = 0; k < odds[n].length; k++)
            {
            /*
               compute binomial coefficient
               n * (n - 1) * (n - 2) * . . . * (n - k + 1)
               -------------------------------------------
               1 * 2 * 3 * . . . * k
            */
                int lotteryOdds = 1;
                for (int i = 1; i <= k; i++)
                    lotteryOdds = lotteryOdds * (n - i + 1) / i;

                odds[n][k] = lotteryOdds;
            }

        // print triangular array
        for (int n = 0; n < odds.length; n++)
        {
            for (int k = 0; k < odds[n].length; k++)
            {
                // pad output with spaces
                String output = "    " + odds[n][k];
                // make output field 4 characters wide
                output = output.substring(output.length() - 4);
                System.out.print(output);
            }
            System.out.println();
        }
    }
}



