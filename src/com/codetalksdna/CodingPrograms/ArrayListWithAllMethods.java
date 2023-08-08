package com.codetalksdna.CodingPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListWithAllMethods {
    public static void main(String[] args) {
        Integer[] a = new Integer[]{1,2,3,4,5,6,7,8};
        List<Integer> integerLst = new ArrayList<>();

        integerLst = Arrays.asList(a);
        List<Integer> aa = new ArrayList<>(integerLst);
        aa.add(10);
        System.out.println(" "+aa);

        aa.remove(2);
        System.out.println("After removal of array "+aa);

        Boolean isPresent = aa.contains(10);
        System.out.println("10 is present in the array "+isPresent);

        System.out.println("List of a  "+List.of(a));

        Boolean isPresent1 = aa.containsAll(List.of(a));
        System.out.println("contains all of a "+isPresent1);

        aa.add(3, 44);
        System.out.println("After adding element at 3rd index "+aa);

        int index = aa.indexOf(44);
        System.out.println(index);

        System.out.println("aa is equals to a "+aa.equals(a));
        System.out.println("7th index element is  "+aa.get(7));
        aa.set(7,55);
        System.out.println("aa after replacing 7th element "+aa);
        System.out.println("7th index element is  "+aa.get(7));
        System.out.println("is aa empty "+aa.isEmpty());
        System.out.println("hash code of aa is "+aa.hashCode());
        aa.addAll(List.of(a));
        System.out.println("aa after adding a "+aa);
        System.out.println("aa is "+aa.toString());
        Integer[] intArray = new Integer[aa.size()];
       /* intArray = (Integer[]) aa.toArray();
        System.out.println("Array is "+intArray);*/
    }
}
