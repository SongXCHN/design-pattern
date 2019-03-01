package org.github.beverages;

import org.github.Beverage;

/**
 * 咖啡
 * Created by SongX on 2019/3/1.
 */
public class Espresso extends Beverage {

    public Espresso() {
        setDescription("Espresso");
    }

    public double cost() {
        return 1.99;
    }
}
