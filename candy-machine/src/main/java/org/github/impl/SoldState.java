package org.github.impl;

import org.github.GumballMachine;
import org.github.State;

/**
 * 已售出
 * Created by SongX on 2019/4/17.
 */
public class SoldState implements State {

    GumballMachine gumballMachine;

    public SoldState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    public void insertQuarter() {
        System.out.println("please wait, we're already giving you a gumball");
    }

    public void ejectQuarter() {
        System.out.println("sorry, you already turned the crank");
    }

    public void turnCrank() {
        System.out.println("turning twice doesn't get you another gumball");
    }

    public void dispense() {
        gumballMachine.releaseBall();
        if (gumballMachine.getCount() > 0) {
            gumballMachine.setState(gumballMachine.getNoQuarterState());
        } else {
            System.out.println("oops, out of gumball");
            gumballMachine.setState(gumballMachine.getSoldOutState());
        }
    }

}
