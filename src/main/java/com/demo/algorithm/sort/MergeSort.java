package com.demo.algorithm.sort;

import lombok.NoArgsConstructor;

/**
 * 归并排序 主要步骤，先使用二分法进行分割， 然后递归合并结果
 *
 */
@NoArgsConstructor
public class MergeSort<T extends Comparable> extends SingleSort<T> {


    private Comparable [] assist = null;

    public MergeSort(Boolean desc) {
        super();
        if (desc!=null){
            super.desc = desc;
        }
    }

    @Override
    public void sort(Comparable<T>[] data) {
    if (data==null||data.length==1){
        return;
      }
    assist = new Comparable[data.length];
    int length = data.length;
    sort(data,0,length-1);
    }


    private void sort(Comparable<T>[] data, int lo, int hi) {
        if (lo>=hi){
            return;
        }
        int mid =(lo+hi)/2;
        sort(data,lo,mid);
        sort(data,mid+1,hi);
        merge(data,lo,mid,hi);
    }

    private void merge(Comparable<T>[] data, int lo, int mid, int hi) {
        int tem = lo;
        int left = lo;
        int right = mid+1;
        while (left<=mid && right<=hi){
            if (comparable(data[left],data[right])){
                assist[tem++] = data[left++];
            }else {
                assist[tem++] = data[right++];
            }
        }
        while (left<=mid){
            assist[tem++] = data[left++];
        }
        while (right<=hi){
            assist[tem++] = data[right++];
        }

        for (int index = lo; index <= hi; index++) {
            data [index] =assist[index];
        }

    }


    public void setDesc(boolean desc) {
        this.desc = desc;
    }
}
