package com.java.tests;

public class DoWhileInWhileLoop {
    public static void main(String[] args) {
        /* *******************************Explanation****************************************
        The first time this loop executes,the inner loop repeats until the value of x is 4.The
        value will then be decremented to 3 and that will be the output at the end of the first iteration
        of the outer loop.On the second iteration of the outer loop,the inner do-while will
        be executed once,even though x is already not greater than 5.As you may recall,do-while
        statements always execute the body at least once.This will reduce the value to 1,which will
        be further lowered by the decrement operator in the outer loop to 0.Once the value reaches
        0,the outer loop will terminate
        */
        int x = 20;
        while(x > 0) {
            do {
                x -= 2;
            } while (x>5);
            x--;
            System.out.print(x+"\t");
        }
    }
}
