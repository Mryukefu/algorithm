package com.demo.algorithm.sort;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

/**
 * 选择排序  步骤
 * 1：定义一个排序的位置
 * 第二层个循环上下以此对比，
 * 如果上一个小于下一个的话，
 * 就记录较小的那个值得索引，
 * 然后在最外层交互
 */
@NoArgsConstructor
public class Selection<T extends Comparable>  extends SingleSort<T>{

    public Selection(Boolean desc) {
        super();
        if (desc!=null){
            super.desc = desc;
        }
    }

    public void sort(Comparable<T> [] data){
        if (data==null||data.length==1){
            return;
        }
        int length = data.length;
        for (int i = 0; i < length-2; i++) {
           int index = i;
            for (int j = i; j < length - 1; j++) {
                if (comparable(data[index],data[j])){
                    index =  j;
                }
            }
            swap(data,i,index);
        }
    }




}
