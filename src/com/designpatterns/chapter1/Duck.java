package com.designpatterns.chapter1;

import com.designpatterns.chapter1.fly.FlyBehaviour;
import com.designpatterns.chapter1.quack.QuackBehaviour;

/**
 * Description:
 */
public abstract class Duck {
    protected FlyBehaviour flyBehaviour;
    protected QuackBehaviour quackBehaviour;

    public Duck() {
    }

    public abstract void display();

    public void performFly() {
        flyBehaviour.fly();
    }

    public void performQuack() {
        quackBehaviour.quack();
    }

    public void swim() {
        System.out.println("All ducks float, even decoys!");
    }
}
