package com.designpatterns.chapter1.quack;

/**
 * Description:
 */
public class MuteQuack implements QuackBehaviour {
    @Override
    public void quack() {
        System.out.println("<< SILENCE >>");
    }
}
