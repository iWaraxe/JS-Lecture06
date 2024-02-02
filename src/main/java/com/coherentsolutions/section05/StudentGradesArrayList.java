package com.coherentsolutions.section05;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class StudentGradesArrayList {
    public static void main(String[] args) {
        // Initialize the ArrayList with some grades
        ArrayList<Integer> grades = new ArrayList<>(Arrays.asList(90, 85, 77, 95, 80));

        // Find the highest grade
        int highestGrade = Collections.max(grades);
        System.out.println("Highest Grade: " + highestGrade);

        // Calculate the average grade
        double averageGrade = grades.stream().mapToInt(Integer::intValue).average().getAsDouble();
        System.out.println("Average Grade: " + averageGrade);

        // Update a grade
        grades.set(2, 79);  // Change the grade at index 2 to 79
        System.out.println("Updated Grades: " + grades);
    }
}

