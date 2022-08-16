package org.example;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapIterator {
    public static void main(String[] args) {
        HashMap<String,Integer> hashMap = new HashMap<>();
        hashMap.put("Fruit",2);
        hashMap.put("Veggie",3);
        hashMap.put("Meat",4);
        hashMap.put("Diary",5);
        for(Map.Entry<String,Integer>em : hashMap.entrySet()){
            System.out.println(em.getKey()+":"+em.getValue());
        }
    }
}
