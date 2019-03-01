package org.github.condiments;

import org.github.Beverage;
import org.github.CondimentDecorator;

/**
 * 奶油（装饰者）
 * Created by SongX on 2019/3/1.
 */
public class Whip extends CondimentDecorator {
    private Beverage beverage;

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }
    public String getDescription() {
        return beverage.getDescription() + ", Whip";
    }

    public double cost() {
        return .18 + + beverage.cost();
    }
}
