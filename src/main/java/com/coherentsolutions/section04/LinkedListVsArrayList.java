package com.coherentsolutions.section04;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class LinkedListVsArrayList {
    public static void main(String[] args) {
        arrayListRandomAccess();
        linkedListRandomAccess();
        linkedListInsertDelete();
        arrayListInsert();
    }

    /*
     * LinkedList vs ArrayList Performance Comparison
     * - Addition: LinkedList O(1), ArrayList O(n)
     * - Deletion: LinkedList O(1), ArrayList O(n)
     * - Search: LinkedList O(n), ArrayList O(1)
     */

    public static void arrayListRandomAccess() {
        System.out.println("--- ArrayList Random Access ---");
        ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));

        // Fast Random Access
        int element = arrayList.get(2);  // Should return 3
        System.out.println("Randomly accessed element: " + element);
    }

    public static void linkedListRandomAccess() {
        System.out.println("--- LinkedList Random Access ---");
        LinkedList<Integer> linkedList = new LinkedList<>(Arrays.asList(1, 2, 3, 4, 5));

        // Slower Random Access compared to ArrayList
        int element = linkedList.get(2);  // Should return 3
        System.out.println("Randomly accessed element: " + element);
    }

    public static void linkedListInsertDelete() {
        System.out.println("--- LinkedList Insertion and Deletion ---");
        LinkedList<Integer> linkedList = new LinkedList<>(Arrays.asList(1, 2, 3, 4, 5));

        // Fast Insertion and Deletion
        linkedList.addFirst(0);  // Adds 0 at the beginning
        linkedList.removeLast();  // Removes 5 from the end

        System.out.println("LinkedList after operations: " + linkedList);
    }

    public static void arrayListInsert() {
        System.out.println("--- ArrayList Insertion ---");
        ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(1, 2, 4, 5));

        // Slower Insertion compared to LinkedList
        arrayList.add(2, 3);  // Inserts 3 at index 2, requires shifting

        System.out.println("ArrayList after operations: " + arrayList);
    }
}
