package org.github;

/**
 * 饮料抽象类
 * Created by SongX on 2019/3/1.
 */
public abstract class Beverage {
    private String description = "Unknown Beverage";

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public abstract double cost();
}
