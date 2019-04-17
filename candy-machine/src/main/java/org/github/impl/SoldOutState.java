package org.github.impl;

import org.github.GumballMachine;
import org.github.State;

/**
 * 糖果售罄
 * Created by SongX on 2019/4/17.
 */
public class SoldOutState implements State {
    GumballMachine gumballMachine;

    public SoldOutState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    public void insertQuarter() {
        gumballMachine.setState(gumballMachine.getHasQuarterState());
        System.out.println("you can't insert another quarter, the machine is sold out");
    }

    public void ejectQuarter() {
        System.out.println("you can't eject, you haven't inserted a quarter yet");
    }

    public void turnCrank() {
        System.out.println("you turned, but there are no gumballs");
    }

    public void dispense() {
        System.out.println("no gumball dispensed");
    }
}
