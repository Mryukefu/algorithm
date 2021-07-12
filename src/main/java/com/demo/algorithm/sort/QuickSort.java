package com.demo.algorithm.sort;

import lombok.NoArgsConstructor;

/**
 * 快速排序
 * @param <T>
 */
@NoArgsConstructor
public class QuickSort<T extends Comparable> extends SingleSort<T> {

    public QuickSort(Boolean desc) {
        super();
        if (desc!=null){
            super.desc = desc;
        }
    }
     @Override
    public void sort(Comparable<T>[] data) {
        if (data == null || data.length == 1) {
            return;
        }
        int length = data.length;
        sort(data, 0, length - 1);
    }

    private void sort(Comparable[] data, int begin, int end) {
        if (begin >= end) {
            return;
        }
        int partition = partition(data, begin, end);
        sort(data,begin,partition-1);
        sort(data,partition+1,end);
    }

    private int partition(Comparable[] data, int begin, int end) {
        Comparable temp = data[begin];
        Integer left = begin;
        Integer right = end;

        while (true) {
            //  右指正左移动
            while (left < right && comparable(data[right], temp)) {
                right--;
            }
            data[left] = data[right];

            //  右指正左移动
            while (left < right && !comparable(data[left], temp)) {
                left++;
            }
            data[right] = data[left];

            if (left>=right){
                break;
            }
        }
        data[left] = temp;
        return left;
    }

}
