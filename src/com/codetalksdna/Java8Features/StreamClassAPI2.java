package com.codetalksdna.Java8Features;

import java.util.Arrays;
import java.util.List;

public class StreamClassAPI2 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int sumOfSquare = Arrays.stream(array).map(x -> x * x).sum();
        System.out.println(sumOfSquare);

        List<String> stringList = List.of("Nitesh", "Kavya", "Indu");
        List<String> modifiedStringList = stringList.stream().filter(name -> name.length() > 4).map(String::toUpperCase).toList();
        System.out.println(modifiedStringList);
    }
}
