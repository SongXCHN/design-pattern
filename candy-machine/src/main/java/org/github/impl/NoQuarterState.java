package org.github.impl;

import org.github.GumballMachine;
import org.github.State;

/**
 * 没有25分钱
 * Created by SongX on 2019/4/17.
 */
public class NoQuarterState implements State {
    GumballMachine gumballMachine;

    public NoQuarterState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    public void insertQuarter() {
        System.out.println("you inserted a quarter");
        gumballMachine.setState(gumballMachine.getHasQuarterState());
    }

    public void ejectQuarter() {
        System.out.println("you haven't inserted a quarter");
    }

    public void turnCrank() {
        System.out.println("you turned but there's no quarter");
    }

    public void dispense() {
        System.out.println("you need to pay first");
    }
}
