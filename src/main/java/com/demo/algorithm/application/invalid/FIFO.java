package com.demo.algorithm.application.invalid;

import java.util.LinkedList;

/**
 * class desc first in first out
 * 失效算法 现进先出 缺点 没有根据使用情况进行留存
 * @author ykf
 * @date 2021/7/13 10:47
 */
public class FIFO<E> {

    LinkedList<E> fifo = new LinkedList<>();

    private Integer size = 10;

    public Boolean add(E e){
        fifo.add(e);
        if (fifo.size()>=size){
            fifo.remove(e);
        }
        return true;
    }

    public Boolean read(E e){
        for (E e1 : fifo) {
            return e.equals(e1);
        }
        return false;
    }
}
