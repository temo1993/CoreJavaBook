package javaProgramming.techniques.blinov.chap1.varB;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by temo on 10/26/15.
 */
public class WholeNumbersMethod {
    public static int wholeNumbers() {
        System.out.println("Please enter any count of whole numbers and press <c> to count :");
        String count = "c";
        try {
            Scanner userInput = new Scanner(System.in);
            while (count != "c" && userInput.nextInt() == 0) {
                int a = userInput.nextInt();
                System.out.println("Entered " + a);
            userInput.close();
            return a;
        }
        } catch (InputMismatchException e) {
            System.out.println("Wrong format!!!");
        }
        return wholeNumbers();
    }
}
