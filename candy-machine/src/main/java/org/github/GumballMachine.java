package org.github;

import org.github.impl.HasQuarterState;
import org.github.impl.NoQuarterState;
import org.github.impl.SoldOutState;
import org.github.impl.SoldState;

/**
 * Created by SongX on 2019/4/17.
 */
public class GumballMachine {

    State soldOutState;
    State noQuarterState;
    State hasQuarterState;
    State soldState;

    State state = soldState;
    int count = 0;  //追踪糖果数目

    public GumballMachine(int numberGumballs) {
        soldOutState = new SoldOutState(this);
        noQuarterState = new NoQuarterState(this);
        hasQuarterState = new HasQuarterState(this);
        soldState = new SoldState(this);
        this.count = numberGumballs;
        if (numberGumballs > 0) {
            state = noQuarterState;
        }
    }


    // 塞25分钱
    public void insertQuarter() {
        state.insertQuarter();
    }

    //退25分钱
    public void ejectQuarter() {
        state.ejectQuarter();
    }

    //转动手柄
    public void turnCrank() {
        state.turnCrank();
        state.dispense();
    }

    public void dispense() {
        state.dispense();
    }

    public void  releaseBall() {
        System.out.println("a gumball comes rolling out the slot...");
        if (count != 0) {
            count --;
        }
    }


    public State getSoldOutState() {
        return soldOutState;
    }

    public void setSoldOutState(State soldOutState) {
        this.soldOutState = soldOutState;
    }

    public State getNoQuarterState() {
        return noQuarterState;
    }

    public void setNoQuarterState(State noQuarterState) {
        this.noQuarterState = noQuarterState;
    }

    public State getHasQuarterState() {
        return hasQuarterState;
    }

    public void setHasQuarterState(State hasQuarterState) {
        this.hasQuarterState = hasQuarterState;
    }

    public State getSoldState() {
        return soldState;
    }

    public void setSoldState(State soldState) {
        this.soldState = soldState;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
