package com.coherentsolutions.section04;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class LinkedListAdvancedOps {
    public static void main(String[] args) {
        Deque<Integer> advancedLinkedList = new LinkedList<>();

        // Using addFirst() to add an element to the beginning
        advancedLinkedList.addFirst(1);
        System.out.println("After addFirst: " + advancedLinkedList);

        // Using addLast() to add an element to the end
        advancedLinkedList.addLast(2);
        System.out.println("After addLast: " + advancedLinkedList);

        // Using removeFirst() to remove the first element
        advancedLinkedList.removeFirst();
        System.out.println("After removeFirst: " + advancedLinkedList);

        // Using removeLast() to remove the last element
        advancedLinkedList.removeLast();
        System.out.println("After removeLast: " + advancedLinkedList);
    }
}
