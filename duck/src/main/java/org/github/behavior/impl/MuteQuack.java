package org.github.behavior.impl;

import org.github.behavior.QuackBehavior;

/**
 * 其实不会叫
 * Created by SongX on 2019/2/28.
 */
public class MuteQuack implements QuackBehavior {
    public void quack() {
        System.out.println("silence");
    }
}
