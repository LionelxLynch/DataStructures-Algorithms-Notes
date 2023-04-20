// Author: Lionel Lynch
// File Name: DoublyLinkedList.java
/*
Doubly linked list is a data structure that consists of a sequence of nodes,
where each node contains a value and two pointers: one pointing to the previous node in the list,
and one pointing to the next node in the list.The first node in the list is called the head,
and the last node in the list is called the tail.

Here are some of the pros and cons of using a doubly linked list:

Pros:
- Doubly linked lists offer fast insertion and deletion times.
It is possible to insert or delete a node in a doubly linked list in constant time,
as long as you have a reference to the node.

- Doubly linked lists allow you to easily traverse the list in either direction.
With a singly linked list, you can only traverse the list in one direction.

- Doubly linked lists can be used to implement other data structures, such as stacks and queues.

Cons:
- Doubly linked lists require more memory than some other data structures, such as arrays or singly linked lists,
as each node in the list requires additional memory to store the two pointers.

- Doubly linked lists do not offer constant-time access to elements.
The time it takes to access an element in a doubly linked list depends on the position of the element in the list.

- Doubly linked lists are more complex to implement than some other data structures,
and may require more code to implement the same functionality.
Overall, doubly linked lists offer a number of benefits, but they also have some limitations.
 */

package com.lioneltlynch.algorithms.dataStructures;

import java.util.LinkedList;
import java.util.ListIterator;

public class DoublyLinkedList {
    class Node{
        int data;
        Node next;
        Node prev;

        // Constructor
        Node (int data){
            this.data = data;
        }

    }
    public Node reverseList(Node head) {
        Node prev = null;
        Node curr = head;

        while (curr != null) {
            Node tmpNext = curr.next;
            curr.next = prev;
            prev = curr;
            curr = tmpNext;
        }
        return prev;
    }

    private record Person(String name, int age){}
    private void lessonWithLinkedList(){
        LinkedList<Person> linkedList = new LinkedList<>();

        linkedList.add(new Person("Matthew", 21));
        linkedList.add(new Person("Ali", 23));
        linkedList.addFirst(new Person("Robert", 43));
        linkedList.add(new Person("Ben", 31));

        ListIterator<Person> personListIterator  = linkedList.listIterator();
        while(personListIterator.hasNext()){
        System.out.println(personListIterator.next());
        }
        System.out.println();
        while(personListIterator.hasPrevious()){
        System.out.println(personListIterator.previous());
        }

    }
}
