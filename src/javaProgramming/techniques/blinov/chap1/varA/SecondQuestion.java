package javaProgramming.techniques.blinov.chap1.varA;

import java.util.Scanner;

/**
 * Created by temo on 10/26/15.
 */
public class SecondQuestion {
    public static void main(String[] args) {
        System.out.println("Please enter your name and press <Enter> :");
        Scanner name = new Scanner(System.in);
        String userName = name.next();
        System.out.println("Please enter your surname and press <Enter> :");
        Scanner surname = new Scanner(System.in);
        String userSurname = surname.next();
        System.out.println("Please enter your age and press <Enter> :");
        Scanner age = new Scanner(System.in);
        String userAge = age.next();
        name.close();
        surname.close();
        age.close();
        System.out.println("Age: " + userAge + "\nSurname: " + userSurname + "\nName: " + userName);
    }
}
