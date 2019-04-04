package org.github;


import java.util.Iterator;

/**
 * 女招待
 * Created by SongX on 2019/4/4.
 */
public class Waitress {
    MenuComponent allMenus;

    //在构造器中，女招待照顾两个菜单
    public Waitress(MenuComponent allMenus) {
        this.allMenus = allMenus;
    }

    public void printMenu() {
        allMenus.print();
    }

    //打印蔬菜
    public void printVegetarianMenu() {
        Iterator iterator = allMenus.createIterator();
        while (iterator.hasNext()) {
            MenuComponent menucomponent = (MenuComponent) iterator.next();
            try {//调用全部的menucomponent的isVegetarian()方法，但是Menu会抛出异常，因为它们不支持这个操作
                if (menucomponent.isVegetarian()) {
                    menucomponent.print();
                }
            } catch (UnsupportedOperationException e) {
            }

        }
    }

}
