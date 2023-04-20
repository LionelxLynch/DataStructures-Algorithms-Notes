// Author: Lionel Lynch
// File Name: SinglyLinked List.java

/*
A Singly Linked List in Java is a linear data structure where each element is a node that consists of
a data field and a reference (link) to the next node in the list. It is a dynamic data structure,
meaning that the size of the list can change during the execution of the program.

Some pros of using a Singly Linked List in Java are:

Pros
- They are dynamic, which means that you can add or remove elements
from the list at any time without having to specify the size in advance.

- They use less memory than an array because they only store the data and a reference to the next element.

- They allow you to insert and delete elements at any position in the list.

- They are easy to implement and can be used to build more complex data structures
such as stacks, queues, and trees.

Some cons of using a Singly Linked List in Java are:

- They do not provide random access to the elements, which means that you cannot access
or update a specific element in the list using an index like you can with an array.

- They are less efficient than arrays when it comes to accessing or updating elements
because you need to traverse the list from the beginning to reach a specific element.

- They are not suitable for situations where you need to frequently access
or update elements at specific positions in the list. If you need to do this,
you may want to consider using an ArrayList or a LinkedList,
which are implemented using an array or a doubly linked list, respectively.
 */

package com.lioneltlynch.algorithms.dataStructures;

public class SinglyLinkedList {
    class Node {
        int data;
        Node next;

        // Constructor
        Node(int data) {
            this.data = data;
        }
    }

}