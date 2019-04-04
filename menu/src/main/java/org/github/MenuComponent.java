package org.github;

import java.util.Iterator;

/**
 * Created by SongX on 2019/4/4.
 */
public abstract class MenuComponent {

    /*因为有些方法只对菜单项有意义，而有些则只对菜单有意义，默认实现是抛出UnsupportedOperationException异常。
     * 这样，如果菜单项或者菜单不支持某个操作，他们就不需要做任何事情，直接继承默认实现就可以了。*/

    //组合的方法组织在一起，即新增、删除和取得菜单组件
    public void add(MenuComponent menuComponent) {
        throw new UnsupportedOperationException();
    }

    public MenuComponent getChild(int i) {
        throw new UnsupportedOperationException();
    }

    public void remove(MenuComponent menuComponent) {
        throw new UnsupportedOperationException();
    }


    //下面是操作的方法
    public String getName() {
        throw new UnsupportedOperationException();
    }

    public String getDescription() {
        throw new UnsupportedOperationException();
    }

    public double getPrice() {
        throw new UnsupportedOperationException();
    }

    public boolean isVegetarian() {
        throw new UnsupportedOperationException();
    }

    public void print() {
        throw new UnsupportedOperationException();
    }

    //加入一个方法，每个菜单和菜单项都必须实现这个方法，即，对每一个组合调用createIterator()方法，将会应用于该组合的所有孩子
    public abstract Iterator createIterator();
}