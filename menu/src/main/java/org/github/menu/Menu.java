package org.github.menu;

import org.github.MenuComponent;
import org.github.iterator.CompositeIterator;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by SongX on 2019/4/4.
 */
public class Menu extends MenuComponent {
    //菜单可以有任意数目的孩子，这些孩子都必须属于MenuComponent类型，我们使用内部的ArrayList记录它们
    ArrayList menuComponents = new ArrayList();
    String name;
    String description;

    public Menu(String name, String description) {
        this.name = name;
        this.description = description;
    }

    //将菜单项和其他菜单加入菜单中，同理，处理删除或者取得某个MenuComponent
    public void add(MenuComponent menuComponent) {
        menuComponents.add(menuComponent);
    }

    public void remove(MenuComponent menuComponent) {
        menuComponents.remove(menuComponent);
    }

    public MenuComponent getChild(int i) {
        return (MenuComponent) menuComponents.get(i);
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    //注意，这里没有覆盖getPrice()或者isVegetarian(),因为这些方法对Menu来说并没有意义

    public void print() {
        System.out.print("\n" + getName());
        System.out.println(", " + getDescription());
        System.out.println("---------------------");

        //不仅打印出菜单本身的信息，也打印出菜单内所有组件的内容：其他菜单和菜单项
        Iterator iterator = menuComponents.iterator();
        while (iterator.hasNext()) {
            MenuComponent menuComponent = (MenuComponent) iterator.next();
            menuComponent.print();
        }
    }

    @Override
    public Iterator createIterator() {
        //组合迭代器
        return new CompositeIterator(menuComponents.iterator());
    }
}