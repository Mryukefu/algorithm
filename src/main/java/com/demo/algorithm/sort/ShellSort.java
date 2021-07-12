package com.demo.algorithm.sort;

import lombok.NoArgsConstructor;

import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * 希尔排序 排序的思想是分而治之  采用二分法的 对每一个分组都排好了的话，其实
 */
@NoArgsConstructor
public class ShellSort<T extends Comparable> extends SingleSort<T> {


    public ShellSort(Boolean desc) {
        super();
        if (desc!=null){
            super.desc = desc;
        }
    }

    /**
     * 希尔排序
     * @param data
     */
    @Override
    public void sort(Comparable<T>[] data) {
        if (data==null||data.length==1){
            return;
        }
        int length = data.length;
        int h  = 1;
        while (h<length/2){
            h = 2*h+1;
        }
        while (h>=1){
            for (int i = h; i < length; i++) {
                for (int j = i; j >= h; j -=h) {
                    if (comparable(data[j-h],data[j])){
                        swap(data,j-h,j);
                    }
                }
            }
            h = h/2;
        }

    }
}
