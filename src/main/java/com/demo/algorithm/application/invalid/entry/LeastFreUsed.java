package com.demo.algorithm.application.invalid.entry;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * class desc
 * todo
 *
 * @author ykf
 * @date 2021/7/13 14:39
 */
@Data
@AllArgsConstructor
public class LeastFreUsed<K> implements Comparable{

    private K key;

    private Long recTime;

    private Integer readCount;



    @Override
    public int compareTo(Object o) {
        LeastFreUsed o1 = (LeastFreUsed) o;
        int compared = this.readCount - o1.readCount;
        return compared==0?this.recTime.compareTo(o1.getRecTime()):compared;
    }
}
