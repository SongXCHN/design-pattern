package org.github.behavior.impl;

import org.github.behavior.QuackBehavior;

/**
 * 真的会呱呱叫
 * Created by SongX on 2019/2/28.
 */
public class Quack implements QuackBehavior {
    public void quack() {
        System.out.println("quack");
    }
}
