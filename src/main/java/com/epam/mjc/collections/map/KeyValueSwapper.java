package com.epam.mjc.collections.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class KeyValueSwapper {
    public Map<String, Integer> swap(Map<Integer, String> sourceMap) {
        Map<String, Integer> map = new HashMap<>();
        Set<Integer> keySet = sourceMap.keySet();
        Iterator<Integer>it = keySet.iterator();
        while(it.hasNext()){
            int key = it.next();
            map.put(sourceMap.get(key), key);
        }
        return map;
    }
}
