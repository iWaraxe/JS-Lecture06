package com.coherentsolutions.section03;

import java.util.ArrayList;
import java.util.List;

public class ArrayListAdvancedOps {
    public static void main(String[] args) {
        ArrayList<Integer> advancedList = new ArrayList<>();

        // Using ensureCapacity()
        advancedList.ensureCapacity(100);

        // Using trimToSize()
        advancedList.trimToSize();

        // Using subList()
        advancedList.add(1);
        advancedList.add(2);
        advancedList.add(3);
        List<Integer> sublist = advancedList.subList(0, 2);
        System.out.println("Sublist from index 0 to 2: " + sublist);  // Output will be [1, 2]
    }
}
