package javaProgramming.techniques.blinov.chap1.varA;

import java.util.Scanner;

/**
 * Created by temo on 10/26/15.
 */
public class FourthQuestion {
    public static void main(String[] args) {
        String password = "123456";
        System.out.println("Please enter your password and press <Enter> :");
        Scanner userInput = new Scanner(System.in);
        String userPassword = userInput.next();
        if (password.equals(userPassword)){
            System.out.println("Password is " + password.equals(userPassword) + ", Welcome");
        }
        else while (password.equals(userPassword) == false){
            System.out.println("Password is " + password.equals(userPassword) + "!!!\nTry again :");
            userPassword = userInput.next();
        }
        userInput.close();
    }
}
