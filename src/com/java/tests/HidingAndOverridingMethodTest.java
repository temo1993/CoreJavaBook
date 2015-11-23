package com.java.tests;

public class HidingAndOverridingMethodTest {
    public static void main(String[] args) {
    }
    private void x(int x){
    }
    private static void x(int x,int y){
    }

    void y(int x){
    }
    static void y(int x,int y){
    }

    protected void z(int x){
    }
    protected static void z(int x,int y){
    }

}
class HidingAndOverridingMethod extends HidingAndOverridingMethodTest{
    // hiding method
    private void x(int x){
    }
    // hiding method
    private static void x(int x,int y){
    }


    // overriding method
    void y(int x) {
    }
    // hiding method
    static void y(int x,int y){
    }


    // overriding method
    protected void z(int x) {
    }
    // hiding method
    protected static void z(int x,int y){
    }
}
