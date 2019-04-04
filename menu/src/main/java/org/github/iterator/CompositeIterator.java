package org.github.iterator;

import org.github.MenuComponent;
import org.github.menu.Menu;

import java.util.*;

/**
 * 组合迭代器
 * Created by SongX on 2019/4/4.
 */
public class CompositeIterator implements Iterator {

    Stack stack = new Stack();

    //将要遍历的顶层组合的迭代器传入，放入一个堆栈数据结构中
    public CompositeIterator(Iterator iterator){
        stack.push(iterator);
    }


    @Override
    public boolean hasNext() {
        //检查堆栈是否被清空，如果已经空了，就表示没有下一元素了
        if(stack.empty()){
            return false;
        }
        else{
            //否则，从堆栈的顶层中取出迭代器，看看是否还有下一元素。如果它没有元素，将它弹出堆栈，然后递归地调用hasNext()。
            Iterator Iterator = (Iterator) stack.peek();
            if(!Iterator.hasNext()){
                stack.pop();
                return hasNext();
            }else{
                return true;
            }
        }
    }

    @Override
    public Object next() {
        //当客户想要取得下一个元素的时候，先调用hasNext()来确定是否还有下一个
        if(hasNext()){
            //如果还有下一个元素，就从堆栈中取出目前的迭代器，然后取得它的下一个元素
            Iterator iterator = (Iterator) stack.peek();
            MenuComponent component = (MenuComponent) iterator.next();
            //如果元素是一个菜单，就有了另一个需要被包含进遍历的组合，放进堆栈中。 不管是不是菜单，都返回该组件。
            if(component instanceof Menu){
                stack.push(component.createIterator());
            }
            return component;
        }else {
            return null;
        }
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException();

    }

}