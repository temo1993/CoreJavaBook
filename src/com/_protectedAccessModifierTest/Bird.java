package com._protectedAccessModifierTest;

public class Bird {
    protected String text = "floating";
    protected void floatInWater() {
        System.out.println(text);
    }
    public void run(){
        System.out.println("123456");
    }
}