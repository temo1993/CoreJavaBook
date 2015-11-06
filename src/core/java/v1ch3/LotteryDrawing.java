package core.java.v1ch3;

/**
 @version 1.10 1999-12-17
 @author Cay Horstmann
 */

import java.util.*;
import javax.swing.*;

public class LotteryDrawing
{
    public static void main(String[] args)
    {
        String input = JOptionPane.showInputDialog
                ("How many numbers do you need to draw?");
        int k = Integer.parseInt(input);

        input = JOptionPane.showInputDialog
                ("What is the highest number you can draw?");
        int n = Integer.parseInt(input);

        // fill an array with numbers 1 2 3 . . . n
        int[] numbers = new int[n];
        for (int i = 0; i < numbers.length; i++)
            numbers[i] = i + 1;

        // draw k numbers and put them into a second array

        int[] result = new int[k];
        for (int i = 0; i < result.length; i++)
        {
            // make a random index between 0 and n - 1
            int r = (int)(Math.random() * n);

            // pick the element at the random location
            result[i] = numbers[r];

            // move the last element into the random location
            numbers[r] = numbers[n - 1];
            n--;
        }

        // print the sorted array

        Arrays.sort(result);
        System.out.println
                ("Bet the following combination. It'll make you rich!");
        for (int i = 0; i < result.length; i++)
            System.out.println(result[i]);

        System.exit(0);
    }
}

