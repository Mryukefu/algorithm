package com.demo.algorithm.data;

/**
 * class desc
 * 线性表 api 设置
 *
 * @author ykf
 * @date 2021/7/12 16:46
 */
public class ArrayList<T> {

    private T[] data;

    // 元素个数
    private int size;

    /**
     *
     *  构造 方法之所以初始化的为空是为了房子new 而不用，浪费内存
     * @param size
     * @return {@code }
     * @author ykf
     * @date 2021/7/12 16:52
     */
    public ArrayList(Integer size){
        data =(T[])new Object();
        size = size;
    }

    public Integer add(T elem){
        if (elem==null){
            return -1;
        }
        if (size>=data.length){
            reSize();
        }
        data[size++] = elem;
        return 1;
    }


    public Integer remove(T elem){
        if (elem==null){
            return -1;
        }
        if (data.length==0){
            return -1;
        }
        if (size>=data.length){
            reSize();
        }
        data[size++] = elem;
        return 1;
    }


    private void reSize(){
       T[] newData = (T []) new Object[size*2];
        for (int i = 0; i < data.length; i++) {
            newData[i]= data[i];
        }
        data = newData;
    }


}
