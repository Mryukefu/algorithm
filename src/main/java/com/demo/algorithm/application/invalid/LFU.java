package com.demo.algorithm.application.invalid;

import com.demo.algorithm.application.invalid.entry.LeastFreUsed;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * class desc 最近最少使用原則
 * @author ykf
 * @date 2021/7/13 14:29
 */
public class LFU<K,V> {

    private final int size = 10;

    private Map<K,V> cache = new ConcurrentHashMap<>();

    private Map<K, LeastFreUsed> count = new ConcurrentHashMap<>();


    public boolean put(K k, V v){
        V v1 = cache.get(k);
        if (v1==null){

            // 达到临界值
            if (cache.size()==size){
                // 移除元素
                removeElement();
            }
            count.put(k, new LeastFreUsed(k, System.currentTimeMillis(), 1));
        }
        cache.put(k,v);
        return true;
    }



    public void read(K k){
        V v = cache.get(k);
        if (v==null){
            return;
        }
        LeastFreUsed leastFreUsed = count.get(k);
        leastFreUsed.setReadCount(leastFreUsed.getReadCount()+1);
        leastFreUsed.setRecTime(System.currentTimeMillis());
    }

    private void removeElement() {
        LeastFreUsed max = Collections.max(count.values());
        Object key = max.getKey();
        cache.remove(key);
        count.remove(key);

    }


}
