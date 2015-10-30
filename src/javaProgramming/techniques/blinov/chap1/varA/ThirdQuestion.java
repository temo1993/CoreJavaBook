package javaProgramming.techniques.blinov.chap1.varA;


/**
 * Created by temo on 10/26/15.
 */
public class ThirdQuestion {
    public static void main(String[] args) {
        int number[] = {100, 2, 74, 6, 2, 3, 3, 13, 12, 64, 879, 41};
        for (int i = 0; i < number.length; i++) {
            int nums = number[i];
            System.out.println(nums);
        }

        for (int j = 0; j < number.length; j++) {
            int numbs = number[j];
            System.out.print(numbs + " ");
        }
    }
}
