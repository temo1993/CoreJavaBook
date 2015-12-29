package com._0threadTest;

public class ThreadOne {
    public static void startThread() {
        new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                System.out.println("I am thread");
            }
        }).start();
        new Thread(() -> {
            for (int i = 0; i < 50; i++) {
                System.out.println("Hello ** " + i);
            }
        }).start();
    }

    public static void main(String[] args) {
        ThreadOne.startThread();
    }
}
