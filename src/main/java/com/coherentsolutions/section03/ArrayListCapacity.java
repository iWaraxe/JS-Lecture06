package com.coherentsolutions.section03;

import java.util.ArrayList;
import java.lang.reflect.Field;

public class ArrayListCapacity {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        System.out.println("Initial capacity: " + getCapacity(arrayList));

        for (int i = 0; i < 11; i++) {
            arrayList.add(i);
        }

        System.out.println("Capacity after adding 11 elements: " + getCapacity(arrayList));

        arrayList.ensureCapacity(50);
        System.out.println("Capacity after ensureCapacity(50): " + getCapacity(arrayList));

        arrayList.trimToSize();
        System.out.println("Capacity after trimToSize(): " + getCapacity(arrayList));
    }

    public static int getCapacity(ArrayList<?> arrayList) {
        try {
            Field dataField = ArrayList.class.getDeclaredField("elementData");
            dataField.setAccessible(true);
            return ((Object[]) dataField.get(arrayList)).length;
        } catch (Exception e) {
            e.printStackTrace();
            return -1;
        }
    }
}

