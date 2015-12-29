package com._protectedAccessModifierTest.a;

import com._protectedAccessModifierTest.Bird;

public class Gosling extends Bird {
    // extends means create subclass
    public void swim() {
        floatInWater();
// calling protected member
        System.out.println(text);
// calling protected member
    }

    public static void main(String[] args) {
        Bird bird = new Bird();
//        bird.floatInWater();
        Bird bird1 = new Gosling();
//        bird1.floatInWater();
        bird.run();
        Gosling gosling = new Gosling();
        gosling.floatInWater();
    }
}
