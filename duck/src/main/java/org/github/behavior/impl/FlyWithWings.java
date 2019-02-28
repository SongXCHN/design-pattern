package org.github.behavior.impl;

import org.github.behavior.FlyBehavior;

/**
 * 所有有翅膀的鸭子飞行动作
 * Created by SongX on 2019/2/28.
 */
public class FlyWithWings implements FlyBehavior {
    public void fly() {
        System.out.println("I am flying!!!");
    }
}
