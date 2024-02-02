package com.coherentsolutions.section01;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.HashSet;
import java.util.TreeSet;
import java.util.PriorityQueue;

public class ImplementingClasses {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        LinkedList<String> linkedList = new LinkedList<>();
        HashSet<String> hashSet = new HashSet<>();
        TreeSet<String> treeSet = new TreeSet<>();
        PriorityQueue<String> priorityQueue = new PriorityQueue<>();

        // Add some example data (optional)
        arrayList.add("item1");
        linkedList.add("item1");
        hashSet.add("item1");
        treeSet.add("item1");
        priorityQueue.add("item1");

        // Outputs to console to see the example data (optional)
        System.out.println("ArrayList: " + arrayList);
        System.out.println("LinkedList: " + linkedList);
        System.out.println("HashSet: " + hashSet);
        System.out.println("TreeSet: " + treeSet);
        System.out.println("PriorityQueue: " + priorityQueue);
    }
}
