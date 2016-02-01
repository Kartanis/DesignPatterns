package com.designpatterns.chapter1.fly;

/**
 * Description:
 */
public class FlyNoWay implements FlyBehaviour {
    @Override
    public void fly() {
        System.out.println("I can't fly!");
    }
}
