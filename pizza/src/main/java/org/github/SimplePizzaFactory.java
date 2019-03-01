package org.github;

import org.github.model.CheesePizza;
import org.github.model.GreekPizza;
import org.github.model.PepperoniPizza;
import org.github.model.Pizza;

/**
 * Created by SongX on 2019/3/1.
 */
public class SimplePizzaFactory {

    public Pizza createPizza(String type) {
        Pizza pizza = null;

        if (type.equals("cheese")) {
            pizza = new CheesePizza();
        } else if (type.equals("pepperoni")) {
            pizza = new PepperoniPizza();
        } else if (type.equals("greek")) {
            pizza = new GreekPizza();
        }
        return pizza;
    }


}
