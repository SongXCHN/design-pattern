package org.github.impl;

import org.github.GumballMachine;
import org.github.State;

/**
 * 有25分钱
 * Created by SongX on 2019/4/17.
 */
public class HasQuarterState implements State {

    GumballMachine gumballMachine;
    public HasQuarterState (GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    public void insertQuarter() {
        System.out.println("you can't insert another quarter");
    }

    public void ejectQuarter() {
        System.out.println("quarter returned");
        gumballMachine.setState(gumballMachine.getNoQuarterState());
    }

    public void turnCrank() {
        System.out.println("you turned...");
        gumballMachine.setState(gumballMachine.getSoldState());
    }

    public void dispense() {
        System.out.println("no gumball dispensed");
    }
}
