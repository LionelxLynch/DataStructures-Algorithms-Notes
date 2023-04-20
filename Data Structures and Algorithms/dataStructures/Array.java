// Author: Lionel Lynch
// File Name: Array.java

/*
An ArrayList in Java is a resizable array implementation of the List interface.
It allows you to store a collection of elements in an ordered sequence and provides
various methods for adding, removing, and accessing elements.

Some pros of using an ArrayList in Java are:

Pros
- They allow you to store a large number of elements efficiently.

- They provide fast access to the elements using an index, which makes it easy to retrieve or update
a specific element in the list.

- They allow you to insert and delete elements at any position in the list.

- They are implemented using an array, which means that they have a fixed size
and do not require the overhead of a linked list.

Some cons of using an ArrayList in Java are:

Cons
- They can be inefficient when it comes to inserting or deleting elements at
the beginning or middle of the list because the elements need to be shifted
to make room for the new element or to fill the gap left by the deleted element.

NOTE: This is mostly a non issue due to the wide access to memory in the form VM's and clod storage

- They do not allow you to store null elements, which can be a limitation if
you need to represent missing values or placeholder elements in the list.
*/

package com.lioneltlynch.algorithms.dataStructures;
import java.util.ArrayList;

public class Array {
    // 2D Array
    char[][] board = new char[3][3];

    // Alternative method
    char[][] boardTwo = new char[][]{
            new char[]{'-', '-', '-'},
            new char[] {'-', '-', '-'},
            new char[]{'-', '-', '-'}
    };

    ArrayList<Person> list = new ArrayList<>();

    record Person(String name, int age){}

}
