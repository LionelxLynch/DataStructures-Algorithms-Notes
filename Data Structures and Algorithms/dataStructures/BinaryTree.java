// Author: Lionel Lynch
// File Name: BinaryTree.java
/*
A binary tree is a data structure that consists of nodes arranged
in a tree-like structure. Each node has at most two children,and is referred to as the left child and the right child.
The top node in the tree is called the root node. Binary trees are used in a variety of applications,
such as searching and sorting algorithms, and are an important concept in computer science.

Here are some of the pros and cons of using a binary tree:

Pros:
- Binary trees can be used to store and organize large amounts of data in an efficient manner.

- Binary trees are relatively simple to implement and understand, and they are widely used in computer science.

- Binary trees offer fast search and insertion times.

- It is possible to search for an element in a binary tree in logarithmic time,
and to insert or delete an element in logarithmic time as well.

Cons:
- Binary trees can become unbalanced, which can cause search and insertion times to become slower.

- Binary trees do not offer constant-time access to elements.

- The time it takes to access an element in a binary tree depends on the position of the element in the tree.

- Binary trees require more memory than some other data structures,
such as arrays or linked lists, as each node in the tree
requires additional memory to store the left and right child pointers.

- Overall, binary trees offer a number of benefits, but they also have some limitations.
 */

package com.lioneltlynch.algorithms.dataStructures;

public class BinaryTree {

    class Node{
        int data;
        Node left;
        Node right;

        // Constructor
        Node(int data){
            this.data = data;
        }

    }
}
