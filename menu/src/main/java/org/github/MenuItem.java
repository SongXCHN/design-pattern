package org.github;

import org.github.iterator.NullIterator;

import java.util.Iterator;

/**
 * Created by SongX on 2019/4/4.
 */
public class MenuItem extends MenuComponent {
    String name;
    String description;
    //是否为素食
    boolean vegetarian;
    double price;

    public MenuItem(String name,
                    String description,
                    boolean vegetarian,
                    double price) {
        this.name = name;
        this.description = description;
        this.vegetarian = vegetarian;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
    }

    public boolean isVegetarian() {
        return vegetarian;
    }

    public void print() {
        System.out.println(" " + getName());
        if (isVegetarian()) {
            System.out.print("(v)");
        }
        System.out.println(", " + getPrice());
        System.out.println("     -- " + getDescription());
    }

    @Override
    public Iterator createIterator() {
        return new NullIterator();
    }

    /*public String toString() {
        return (name + ", $" + price + "\n   " + description);
    }*/

}