package com.java.tests;

import com.sun.org.apache.bcel.internal.generic.GOTO;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by temo on 10/30/15.
 */
public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {5, 4, 5, 6, 2, 7, 6, 54, 87, 86, 987, 21};
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        int key = 8;
        int aBinarySearch = Arrays.binarySearch(arr, key);

        if (aBinarySearch >= 0)
        System.out.println("The number " + key + " was found and location is --- " + aBinarySearch);

        if (aBinarySearch < 0){
        int numberNotFound = Math.abs(aBinarySearch) - 1;
        System.out.println("The number " + key +" was not found and it must be on position --- " + numberNotFound);

            System.out.println("Would you like to add on that position? y to add, n to do nothing");
            Scanner userAddNumber = new Scanner(System.in);
            char userChoice = userAddNumber.next(".").charAt(0);
            if (userChoice == 'y'){
                Arrays.fill(arr,numberNotFound,numberNotFound + 1,key);
            }else if(userChoice == 'n'){
                System.out.println("Program is going to close. BYE! ");
            }else while(userChoice != 'y' && userChoice != 'n'){
                System.out.println("Bad argument please choose correct one: ");
            }
            System.out.println("After adding the number " + key + " in arr it looks like this: \n" + Arrays.toString(arr));
        }
    }
}
