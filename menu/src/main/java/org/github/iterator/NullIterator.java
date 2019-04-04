package org.github.iterator;

import java.util.Iterator;

/**
 * 空迭代器
 * Created by SongX on 2019/4/4.
 */
public class NullIterator implements Iterator {


    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public Object next() {
        return null;
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException();

    }

}
