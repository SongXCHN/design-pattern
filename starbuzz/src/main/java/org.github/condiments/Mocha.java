package org.github.condiments;

import org.github.Beverage;
import org.github.CondimentDecorator;

/**
 * 摩卡（装饰者）
 * Created by SongX on 2019/3/1.
 */
public class Mocha extends CondimentDecorator {
    private Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }

    public double cost() {
        return .20 + beverage.cost();
    }
}
