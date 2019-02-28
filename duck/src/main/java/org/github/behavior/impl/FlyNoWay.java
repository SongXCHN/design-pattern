package org.github.behavior.impl;

import org.github.behavior.FlyBehavior;

/**
 * 所有不会飞的鸭子动作
 * Created by SongX on 2019/2/28.
 */
public class FlyNoWay implements FlyBehavior {
    public void fly() {
        System.out.println("I can not fly");
    }
}
