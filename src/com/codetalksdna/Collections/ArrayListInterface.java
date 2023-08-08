package com.codetalksdna.Collections;

import java.util.ArrayList;
import java.util.List;

public class ArrayListInterface {
    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();
        arrayList.add(200);
        arrayList.add(100);
        System.out.println(arrayList);
        arrayList.get(0);
        if (arrayList.contains(200)) {
            System.out.println("True Data Exist");
        }
    }
}
