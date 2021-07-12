package com.demo.algorithm.sort;

public abstract class SingleSort<T extends Comparable> {

    protected boolean desc = true;


    public abstract void sort(Comparable<T> [] data);
    /**
     *  判断前一个元素跟后一个元素进行对比
     * @param cur 当前元素
     * @param last 下一个元素
     * @return
     */
    protected boolean comparable(Comparable cur,Comparable last ){
        if (desc) return cur.compareTo(last)>0;
        return cur.compareTo(last)<0;
    }

    /**
     *  交换数组元素
     * @param data
     * @param i
     * @param j
     * @return
     */
    protected void swap(Comparable[] data,Integer i,Integer j ){
        Comparable temp = data[i];
        data[i] = data[j];
        data[j] =temp;
    }


}
