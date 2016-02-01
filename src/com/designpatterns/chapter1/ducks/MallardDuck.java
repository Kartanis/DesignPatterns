package com.designpatterns.chapter1.ducks;

import com.designpatterns.chapter1.fly.FlyWithWings;
import com.designpatterns.chapter1.quack.Quack;

/**
 * Description:
 */
public class MallardDuck extends Duck {

    public MallardDuck() {
        setQuackBehaviour(new Quack());
        setFlyBehaviour(new FlyWithWings());
    }

    @Override
    public void display() {
        System.out.println("I'm real Mallard duck!");
    }
}
