package com.designpatterns.chapter1;

import com.designpatterns.chapter1.ducks.Duck;
import com.designpatterns.chapter1.ducks.MallardDuck;

/**
 * Description:
 */
public class MainDuckSimulator {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.performQuack();
        mallard.performFly();
        mallard.display();
    }
}
