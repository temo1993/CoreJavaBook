package javaProgramming.techniques.blinov.chap1.varA;

import java.util.InputMismatchException;
import java.util.Scanner;

public class FirthQuestionMethod {
    public int sumOperation() {
        System.out.println("Please enter two numbers to sum and press <Enter> :");

        try {
            Scanner userInput = new Scanner(System.in);
            int a = userInput.nextInt();
            int b = userInput.nextInt();
            int sum = a + b;
            System.out.println("sum of " + a + " and " + b + " is: " + sum);

            System.out.println("Please enter two numbers to multiply and press <Enter> :");
            a = userInput.nextInt();
            b = userInput.nextInt();
            sum = a * b;
            System.out.println("Multiply of " + a + " and " + b + " is: " + sum);

            userInput.close();
            return sum;
        } catch (InputMismatchException e) {
            System.out.println("Wrong format!!!");
        }return sumOperation();
    }
}
