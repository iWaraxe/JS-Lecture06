package com.coherentsolutions.section03;

import java.util.ArrayList;
import java.util.List;

public class ArrayListResizing {
    public static void main(String[] args) {
        // Initialize ArrayList with an initial capacity of 2
        ArrayList<Integer> arrayList = new ArrayList<>(2);
        System.out.println("Initial capacity: " + arrayList.size());

        // Adding elements, causing the ArrayList to resize
        arrayList.add(1);
        arrayList.add(2);
        System.out.println("Added two elements: " + arrayList);

        // Adding one more element, this will cause the ArrayList to resize
        arrayList.add(3);
        System.out.println("Added one more element: " + arrayList);

        // Using ensureCapacity() to manually increase the capacity
        arrayList.ensureCapacity(100);
        System.out.println("Manually increased capacity");

        // Adding more elements
        arrayList.add(4);
        arrayList.add(5);
        System.out.println("Added more elements: " + arrayList);

        // Using trimToSize() to trim the capacity to current size
        arrayList.trimToSize();
        System.out.println("Trimmed the capacity to current size");

        // Initial ArrayList
        ArrayList<Integer> numbers = new ArrayList<>();
        long startTime = System.nanoTime();
        for (int i = 0; i < 10000; i++) {
            numbers.add(i);
        }
        long endTime = System.nanoTime();
        long withoutPreSizing = endTime - startTime;
        System.out.println("Time taken for adding 10,000 elements without pre-sizing: " + (endTime - startTime) + " ns");

        // ArrayList with ensured capacity
        ArrayList<Integer> numbersWithCapacity = new ArrayList<>();
        numbersWithCapacity.ensureCapacity(10000);
        startTime = System.nanoTime();
        for (int i = 0; i < 10000; i++) {
            numbersWithCapacity.add(i);
        }
        endTime = System.nanoTime();
        long withPresizing = endTime - startTime;
        System.out.println("Time taken for adding 10,000 elements with pre-sizing: " + (endTime - startTime) + " ns");
        System.out.println("Time factor: " + (double) withoutPreSizing/withPresizing);
    }
}

