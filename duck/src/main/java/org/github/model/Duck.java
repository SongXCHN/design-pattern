package org.github.model;

import org.github.behavior.FlyBehavior;
import org.github.behavior.QuackBehavior;

/**
 * Created by SongX on 2019/2/28.
 */
public abstract class Duck {
    private QuackBehavior quackBehavior;
    private FlyBehavior flyBehavior;

    public void performFly() {
        flyBehavior.fly();
    }

    public void performQuack() {
        quackBehavior.quack();
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }
}
