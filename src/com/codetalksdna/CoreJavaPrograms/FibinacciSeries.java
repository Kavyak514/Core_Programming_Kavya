package com.codetalksdna.CoreJavaPrograms;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class FibinacciSeries {
    public static void main(String[] args) {
        int length = 10;
        int firstNum = 0;
        int secondNum = 1;
        List<Integer> fibinacci = new LinkedList<>();
        fibinacci.add(firstNum);
        fibinacci.add(secondNum);
        for(int i = 2; i <= length; i++){
            int series = fibinacci.get(i-2)+fibinacci.get(i-1);
            fibinacci.add(series);
        }
        System.out.println(fibinacci);
    }
}
