package com.coherentsolutions.introduction;

/*
 * LECTURE 6: Introduction to Collections
 * Topics: Collections Framework, Lists, ArrayList, LinkedList
 */
// Basic Inheritance in Java
public class Animal {
    void makeSound() {
        System.out.println("Animal sound");
    }
}

// The 'extends' keyword signifies inheritance
class Dog extends Animal {
    void makeSound() {
        super.makeSound();  // Calls the makeSound() of Animal class
        System.out.println("Woof woof");
    }
}

/*
 * Transition to Collections
 * Collections in Java are built using Object-Oriented Principles like inheritance.
 */

