package javaProgramming.techniques.blinov.chap1.varA;

import java.util.Scanner;

/**
 * Created by temo on 10/26/15.
 */
public class SayHello {
    public static void main(String[] args) {
        System.out.println("Please enter your name and press <Enter> : ");
        Scanner userNameInput = new Scanner(System.in);
        String name = userNameInput.next();
        System.out.println("Hallo " + name);
        userNameInput.close();
    }
}
