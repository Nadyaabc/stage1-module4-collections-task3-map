package com.epam.mjc.collections.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.StringTokenizer;

public class WordRepetitionMapCreator {
    public Map<String, Integer> createWordRepetitionMap(String sentence) {
        Map<String, Integer> map = new HashMap<>();
        sentence = sentence.toLowerCase();
        String[] array = sentence.split("\\s+");
        if(array.length==1) return map;
        for (int i =0; i < array.length;i++) {
            array[i] = array[i].replaceAll("[^a-zA-Z0-9]", "");
            System.out.println(array[i]);
        }

        for (int i = 0; i < array.length; i++) {
            int count = 0;
            if (!map.containsKey(array[i])) {
                for (int j = i; j < array.length; j++) {
                    if (array[i].equals(array[j])) {
                        count++;
                    }
                }
                map.put(array[i], count);
            }
        }
        return map;
    }
}
