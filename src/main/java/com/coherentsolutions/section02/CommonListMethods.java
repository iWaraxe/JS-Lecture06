package com.coherentsolutions.section02;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class CommonListMethods {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();

        // Using add() to add elements
        fruits.add("Apple");
        fruits.add("Banana");

        // Using get() to access elements
        String firstFruit = fruits.get(0);
        System.out.println("First fruit: " + firstFruit);  // Output will be "Apple"

        // Using set() to change elements
        fruits.set(0, "Mango");  // Changes "Apple" to "Mango"

        // Using get() to access elements
        firstFruit = fruits.get(0);
        System.out.println("First fruit: " + firstFruit);  // Output will be "Mango"


        // Using remove() to remove elements
        fruits.remove(0);  // Removes "Mango"

        // Using size() to get the size of the list
        int size = fruits.size();
        System.out.println("Size of the list: " + size);  // Output will be 1
        System.out.println(fruits);
        System.out.println("First fruit: " + fruits.get(0));  // Output will be "Banana"
    }
}
