package com.codetalksdna.CodingPrograms;

public class NumberToLinkedList {

    static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }

    static ListNode numberToLinkedList(int num) {
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;

        while (num > 0) {
            int digit = num % 10;
            ListNode newNode = new ListNode(digit);
            current.next = newNode;
            current = newNode;
            num /= 10;
        }

        return dummy.next;
    }

    static void printLinkedList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val);
            if (current.next != null) {
                System.out.print(" -> ");
            }
            current = current.next;
        }
        System.out.println(" -> null");
    }

    public static void main(String[] args) {
        int num = 124;
        ListNode linkedList = numberToLinkedList(num);
        System.out.print("Linked list representation of " + num + ": ");
        printLinkedList(linkedList);
    }
}
