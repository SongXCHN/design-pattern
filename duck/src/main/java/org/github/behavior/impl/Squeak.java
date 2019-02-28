package org.github.behavior.impl;

import org.github.behavior.QuackBehavior;

/**
 * 只会吱吱叫
 * Created by SongX on 2019/2/28.
 */
public class Squeak implements QuackBehavior {
    public void quack() {
        System.out.println("squeak");
    }
}
