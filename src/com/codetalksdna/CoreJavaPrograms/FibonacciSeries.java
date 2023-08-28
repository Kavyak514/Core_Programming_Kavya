package com.codetalksdna.CoreJavaPrograms;

import java.util.LinkedList;
import java.util.List;

public class FibonacciSeries {
    public static void main(String[] args) {
        int length = 10;
        int firstNum = 0;
        int secondNum = 1;
        List<Integer> fibonacci = new LinkedList<>();
        fibonacci.add(firstNum);
        fibonacci.add(secondNum);
        for(int i = 2; i <= length; i++){
            int series = fibonacci.get(i-2)+fibonacci.get(i-1);
            fibonacci.add(series);
        }
        System.out.println(fibonacci);
    }
}
