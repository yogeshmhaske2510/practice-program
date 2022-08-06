package com.java8;

import java.util.HashMap;
import java.util.Map;

public class HashMapIteration {
    public static void main(String[] args) {
        Map<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1,"a");
        hashMap.put(2,"b");
        hashMap.put(3,"c");

        //using stream
        hashMap.entrySet().stream().forEach(e-> System.out.println(e.getKey()+":"+e.getValue()));

        //using forEach and lambda
        hashMap.forEach((k,v)-> System.out.println(k+":"+v));

        //using key to iterate over map and get value
        hashMap.keySet().forEach(k-> System.out.println(hashMap.get(k)));
    }
}
