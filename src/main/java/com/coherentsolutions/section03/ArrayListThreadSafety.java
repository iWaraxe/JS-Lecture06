package com.coherentsolutions.section03;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListThreadSafety {
    public static void main(String[] args) {
        // Making ArrayList thread-safe
        List<Integer> synchronizedList = Collections.synchronizedList(new ArrayList<>());
        System.out.println("Initialized a synchronized ArrayList: " + synchronizedList);
    }
}

