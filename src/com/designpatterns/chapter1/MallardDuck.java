package com.designpatterns.chapter1;

import com.designpatterns.chapter1.fly.FlyWithWings;
import com.designpatterns.chapter1.quack.Quack;

/**
 * Description:
 */
public class MallardDuck extends Duck {

    public MallardDuck() {
        quackBehaviour = new Quack();
        flyBehaviour = new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println("I'm real Mallard duck!");
    }
}