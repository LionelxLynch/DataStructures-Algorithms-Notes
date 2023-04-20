// Author: Lionel Lynch
// File Name: StackDS.java

/*
A Stack in Java is a linear data structure that follows the Last-In-First-Out (LIFO) principle,
which means that the last element added to the stack will be the first one to be removed.
It is an abstract data type that is implemented using an array or a linked list.

Some pros of using a Stack in Java:

Pros
- They provide an easy way to implement a LIFO data structure,
which can be useful in situations where you need to keep track of the
order in which elements were added to the stack.

- Stacks can be used to reverse the order of elements, perform undo/redo operations,
and evaluate expressions in reverse Polish notation.

- They are efficient for adding and removing elements from the top of the stack.

Some cons of using a Stack in Java are:

Cons
- They have a fixed size, which means that you need to specify the maximum number of elements
that the stack can hold when you create it. This can be inconvenient if you don't know in advance
how many elements you will need to store.

- They do not allow you to randomly access or update elements in the middle of the stack.

- They are not as efficient as some other data structures when it comes to inserting or deleting elements
at the bottom of the stack.
 */

package com.lioneltlynch.algorithms.dataStructures;

import java.util.Stack;

public class StackDS {
    Stack<Integer> stack = new Stack<>();
       /* stack.push(12);
        stack.push(13);
        stack.push(14);
        System.out.println(stack.peek());
        System.out.println(stack.size());
        System.out.println(stack.pop());
        System.out.println(stack.size());
        */
}
