package com.demo.algorithm.application.invalid;

import java.util.Iterator;
import java.util.LinkedList;

/**
 * last recently user 最近使用原则
 * class desc
 * 最近使用原则 ,淘汰没有使用时间最久的元素
 *
 * @author ykf
 * @date 2021/7/13 10:59
 */
public class LRU<E> {

    LinkedList<E> linkedList = new LinkedList<>();

    private Integer size  =10;

    public boolean add(E e){
        linkedList.add(e);
        if (linkedList.size()>size){
            linkedList.removeLast();
        }
        return true;
    }

    public boolean read(E e){
        Iterator<E> iterator = linkedList.iterator();
        int index = 0;
        if (iterator.hasNext()) {
            E next = iterator.next();
            if (next.equals(e)){
                linkedList.remove(index);
                linkedList.addFirst(e);
                return true;
            }
            index++;
        }
        return false;
    }
}
