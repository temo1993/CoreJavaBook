package com.java.tests;

/**
 * Created by temo on 11/5/15.
 */
public class StaticClassTest {
    public static void main(String[] args) {
        new StaticClass(1,1).intCount();
    }

    private static class StaticClass{
        int i = 0;
        int j = 0;
        private StaticClass(int i, int j){
            this.i = i;
            this.j = j;
        }
        private void intCount(){
            for (int i = 0; i < this.i; i++) {
                System.out.println("I'am nested class's method? And who are you?");
            }
            System.out.println("))))))))))))))))))))))))))))");
            System.out.println("(((((((((((((((((((((((((((");
            System.out.println("))))))))))))))))))))))))))))");
            for (int j = 0; j < this.j; j++) {
                System.out.println("Ohh don't kill me please!!!");
            }
        }
    }
}



