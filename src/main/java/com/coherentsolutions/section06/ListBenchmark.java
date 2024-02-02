package com.coherentsolutions.section06;

import java.util.ArrayList;
import java.util.LinkedList;

public class ListBenchmark {
    public static void main(String[] args) {
        // Initialize ArrayList and LinkedList
        ArrayList<Integer> arrayList = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();

        // Record start time for ArrayList
        long startTimeArrayList = System.nanoTime();

        // Perform operations on ArrayList
        // For example, adding elements
        for (int i = 0; i < 1000; i++) {
            arrayList.add(i);
        }

        // Record end time and calculate elapsed time for ArrayList
        long endTimeArrayList = System.nanoTime();
        long elapsedTimeArrayList = endTimeArrayList - startTimeArrayList;

        // Record start time for LinkedList
        long startTimeLinkedList = System.nanoTime();

        // Perform operations on LinkedList
        // For example, adding elements
        for (int i = 0; i < 1000; i++) {
            linkedList.add(i);
        }

        // Record end time and calculate elapsed time for LinkedList
        long endTimeLinkedList = System.nanoTime();
        long elapsedTimeLinkedList = endTimeLinkedList - startTimeLinkedList;

        // Compare and analyze the results
        System.out.println("Elapsed Time for ArrayList: " + elapsedTimeArrayList + " ns");
        System.out.println("Elapsed Time for LinkedList: " + elapsedTimeLinkedList + " ns");
    }
}
