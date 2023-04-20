// Author: Lionel Lynch
// File Name: QueueDS.java

/*
In Java, a Queue is an interface that extends the Collection interface and
represents a data structure where elements are added to the end of the queue
and removed from the front. It follows the First-In-First-Out (FIFO) principle,
which means that the first element added to the queue will be the first one to be removed.

Some pros of using Queues in Java are:

Pros
- They provide an easy way to implement a FIFO data structure,
which can be useful in situations where the order of processing is important.

- Queues can be used to store data temporarily while waiting for it to be processed,
allowing you to decouple different parts of your system and improve their scalability.

- They are thread-safe, which means that multiple threads can safely add and remove elements
from the same queue without the need for explicit synchronization.

Some cons of using Queues in Java are:

Cons
- They have a fixed size, which means that you need to specify the maximum number of elements
 that the queue can hold when you create it. This can be inconvenient if you don't know in
 advance how many elements you will need to store.

- They do not allow you to randomly access or update elements in the middle of the queue.
If you need to do this, you will need to use a different data structure such as an ArrayList or LinkedList.

-They are not as efficient as some other data structures when it comes to inserting or deleting
elements in the middle of the queue. If you need to do this frequently,
you may want to consider using a different data structure.

 */

package com.lioneltlynch.algorithms.dataStructures;

public class QueueDS {
      /*
    Queue<Main.Person> superMarketQueue = new LinkedList<>();
        supermarket.add(new Person("Mark", 21));
        supermarket.add(new Person("Alex", 18));
        supermarket.add(new Person("Tim", 32));

        System.out.println(superMarketQueue.size());
        System.out.println(superMarketQueue.peek());
        System.out.println(superMarketQueue.poll());
        System.out.println(superMarketQueue .size());

        static record Person(String name, int age){
        }
       */
}

