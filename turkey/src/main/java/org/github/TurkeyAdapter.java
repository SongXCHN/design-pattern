package org.github;

/**
 * Created by SongX on 2019/3/6.
 */
public class TurkeyAdapter implements Duck {
    Turkey turkey;


    public TurkeyAdapter(Turkey turkey) {
        this.turkey = turkey;
    }

    public void quack() {
        turkey.gobble();
    }

    public void fly() {
        for (int i = 0; i < 5; i++) {
            turkey.fly();
        }

    }
}
