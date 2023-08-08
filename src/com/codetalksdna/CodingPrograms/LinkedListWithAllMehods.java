package com.codetalksdna.CodingPrograms;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class LinkedListWithAllMehods {
    public static void main(String[] args) {
        List<String> linkedList = new LinkedList<>();
        String[] arrayData = new String[]{"Java", "Programming", "Language"};
        System.out.println("Array data is "+arrayData);
        linkedList = Arrays.asList(arrayData);
        System.out.println("Linked list data is "+linkedList);
        List<String> updatedLinkedLst = new LinkedList<>(linkedList);
        updatedLinkedLst.add(1, "Is");
        System.out.println("updated linked list is "+updatedLinkedLst);
        System.out.println(updatedLinkedLst.toString());
        updatedLinkedLst.set(2, "A");
        System.out.println("updated linked list is with Set "+updatedLinkedLst);
        updatedLinkedLst.remove(2);
        System.out.println("updated linked list is with remove at index 2 "+updatedLinkedLst);
    }
}
