package org.github.beverages;

import org.github.Beverage;

/**
 * 另一种饮料
 * Created by SongX on 2019/3/1.
 */
public class HouseBlend extends Beverage {

    public HouseBlend(){
        setDescription("House Blend coffee");
    }


    public double cost() {
        return .89;
    }
}
