package com.codetalksdna.Collections;

import java.util.HashMap;
import java.util.Map;

public class HashMapImplementation {
    public static void main(String[] args) {
        Map<String,String> kvMap = new HashMap<>();
        kvMap.put("1","Nitesh");
        kvMap.put("2","Kavya");
        System.out.println(kvMap);
        System.out.println(kvMap.get("2"));
        System.out.println(kvMap.entrySet());
        System.out.println(kvMap.keySet());
    }
}
