package org.github;

/**
 * Created by SongX on 2019/4/17.
 */
public interface State {

    // 塞25分钱
    void insertQuarter();

    //退25分钱
    void ejectQuarter();

    //转动手柄
    void turnCrank();

    //掉糖果
    void dispense();
}
