package com.coherentsolutions.section01;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Deque;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class CollectionsInterfaces {
    public static void main(String[] args) {
        List<String> myList = new LinkedList<>();
        Set<String> mySet = new HashSet<>();
        Queue<String> myQueue = new LinkedList<>();
        Deque<String> myDeque = new LinkedList<>();
        Map<String, Integer> myMap = new HashMap<>();

        // Outputs to console to see the example data (optional)
        System.out.println("List: " + myList);
        System.out.println("Set: " + mySet);
        System.out.println("Queue: " + myQueue);
        System.out.println("Deque: " + myDeque);
        System.out.println("Map: " + myMap);

        // Add some example data (optional)
        myList.add("item1");
        mySet.add("item1");
        myQueue.add("item1");
        myDeque.add("item1");
        myMap.put("key1", 1);

        // Outputs to console to see the example data (optional)
        System.out.println("List: " + myList);
        System.out.println("Set: " + mySet);
        System.out.println("Queue: " + myQueue);
        System.out.println("Deque: " + myDeque);
        System.out.println("Map: " + myMap);
    }
}

