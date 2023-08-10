package com.codetalksdna.Java8Features;

import java.util.ArrayList;
import java.util.List;

public class LambdaExpression {
    public static void main(String[] args) {
        List<Integer> listInteger = new ArrayList<>();
        listInteger.add(10);
        listInteger.add(20);
        listInteger.add(30);
        listInteger.add(40);
        listInteger.add(50);
        listInteger.add(60);

        System.out.println(listInteger);
        for (int i = 0; i < listInteger.size(); i++) {
            System.out.print(listInteger.get(i) + " ");
        }
        System.out.println();
        for (Integer integer : listInteger) {
            System.out.print(integer + " ");
        }
        System.out.println();
        listInteger.forEach(integer -> {
            System.out.print(integer + " ");
        });
    }
}
