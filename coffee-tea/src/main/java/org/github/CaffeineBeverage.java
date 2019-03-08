package org.github;

/**
 * Created by SongX on 2019/3/8.
 */
public abstract class CaffeineBeverage {
    final public void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        addCondiments();

    }

    abstract void brew();

    abstract void addCondiments();

    public void boilWater() {
        System.out.println("boiling Water");
    }


    public void pourInCup() {
        System.out.println("pouring Into Cup");
    }
}
