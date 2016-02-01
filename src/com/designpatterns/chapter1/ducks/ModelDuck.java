package com.designpatterns.chapter1.ducks;

import com.designpatterns.chapter1.fly.FlyNoWay;
import com.designpatterns.chapter1.quack.Quack;

/**
 * Description:
 */
public class ModelDuck extends Duck {

    public ModelDuck() {
        setFlyBehaviour(new FlyNoWay());
        setQuackBehaviour(new Quack());
    }

    @Override
    public void display() {
        System.out.println("I'm model duck");
    }
}
