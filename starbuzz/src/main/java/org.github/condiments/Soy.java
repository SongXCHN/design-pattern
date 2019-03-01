package org.github.condiments;

import org.github.Beverage;
import org.github.CondimentDecorator;

/**
 * 大豆（装饰者）
 * Created by SongX on 2019/3/1.
 */
public class Soy extends CondimentDecorator {
    private Beverage beverage;

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }
    public String getDescription() {
        return beverage.getDescription() + ", Soy";
    }

    public double cost() {
        return .56 + + beverage.cost();
    }
}
