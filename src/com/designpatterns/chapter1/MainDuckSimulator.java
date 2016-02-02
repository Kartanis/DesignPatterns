package com.designpatterns.chapter1;

import com.designpatterns.chapter1.ducks.Duck;
import com.designpatterns.chapter1.ducks.MallardDuck;
import com.designpatterns.chapter1.ducks.ModelDuck;
import com.designpatterns.chapter1.fly.FlyRocketPowered;

/**
 * Description:
 */
public class MainDuckSimulator {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.performQuack();
        mallard.performFly();
        mallard.display();

        Duck model = new ModelDuck();
        model.performQuack();
        model.performFly();
        model.setFlyBehaviour(new FlyRocketPowered());
        model.performFly();
        model.display();

    }
}
