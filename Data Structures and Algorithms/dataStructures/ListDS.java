// Author: Lionel Lynch
// File Name: ListDS.java
/*
In Java, the List interface is a part of the Java Collections Framework
and is used to represent an ordered collection of elements. There are several implementations of
the List interface available in Java, including ArrayList, LinkedList, and Vector.

Here are some of the pros and cons of using a List in Java:

Pros
- Lists are dynamic in size and can grow or shrink as needed. This makes them very convenient to use,
as you don't have to worry about specifying the size of the list when you create it.

- Lists provide a large number of built-in methods for adding, removing, and manipulating elements.
This makes it easy to work with lists and reduces the amount of code you have to write.

- Lists allow you to access elements using an index, which makes it easy to
retrieve or update specific elements in the list.

Cons
- Lists may not be as fast as some other data structures, such as arrays,
when it comes to accessing or manipulating elements. This is especially true for large lists.

- Lists do not offer constant-time access to elements. The time it takes to access an element in a list
depends on the position of the element in the list,
with elements at the beginning of the list being faster to access than elements at the end.

- Lists use more memory than some other data structures, such as arrays, as they require additional memory
to store pointers or references to the elements in the list.
 */


package com.lioneltlynch.algorithms.dataStructures;

import java.util.ArrayList;
import java.util.List;

public class ListDS {

    List<String> strings = new ArrayList<>();

    //strings.add("Blue");
    //etc...
}
