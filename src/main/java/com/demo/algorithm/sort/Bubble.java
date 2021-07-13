package com.demo.algorithm.sort;

import lombok.NoArgsConstructor;

/**
 * 冒泡排序 主要有三部分组成
 * 判断 前一个元素是否大于后面的元素
 */
@NoArgsConstructor
public class Bubble<T extends Comparable>  extends SingleSort<T>  {



    public Bubble(Boolean desc) {
        super();
        if (desc!=null){
            super.desc = desc;
        }
    }

    public void sort(Comparable[] data ){
        int length = data.length;
        if (length==0){
            return;
        }
        for (int i = length-1; i >0; i--) {
            boolean complete  = true;
            for (int j = 0; j < i; j++) {
                if (comparable(data[j],data[j+1])){
                    complete = false;
                    swap(data,j,j+1);
                }
            }
            if (complete){
                break;
            }
        }
    }





}
