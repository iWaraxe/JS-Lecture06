package com.coherentsolutions.section05;

import java.util.LinkedList;

public class PrintQueueLinkedList {
    public static void main(String[] args) {
        // Initialize the LinkedList with some print jobs
        LinkedList<String> printQueue = new LinkedList<>();
        printQueue.addLast("Job1");
        printQueue.addLast("Job2");
        printQueue.addLast("Job3");

        // Process the next job in the queue
        String nextJob = printQueue.removeFirst();
        System.out.println("Processing: " + nextJob);

        // View the remaining jobs
        System.out.println("Remaining Jobs: " + printQueue);
    }
}
