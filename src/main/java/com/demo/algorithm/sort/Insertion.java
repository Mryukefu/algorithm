package com.demo.algorithm.sort;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class Insertion<T extends Comparable> extends SingleSort<T> {


    public Insertion(Boolean desc) {
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
        int length = data.length;
        for (int i = 0; i < length-1; i++) {
            for (int j = i+1;j>0;j--){
                if (comparable(data[j-1],data[j])){
                    swap(data,j-1,j);
                }else {}
            }
        }
    }
}
