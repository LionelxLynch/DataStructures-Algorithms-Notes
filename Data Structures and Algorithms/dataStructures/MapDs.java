// Author: Lionel Lynch
// File Name: MapDs.java

/*
In Java, a Map is an interface that represents a collection of key-value pairs
and allows you to store and retrieve data based on a key. It is implemented by several classes,
including HashMap, LinkedHashMap, and TreeMap.

Some pros of using Maps in Java are:

Pros
- They allow you to store and retrieve data based on a unique key,
which can be useful when you need to quickly locate a specific element in the map.

- Maps can be used to store data in a more organized and efficient way than using a list or an array.

- They provide a flexible and efficient way to store and retrieve data,
as they allow you to use any object as a key or a value.

Some cons of using Maps in Java are:

Cons
- They do not preserve the insertion order of the elements. This means that the order in which the elements were added to the map is not maintained,
 and the elements may be returned in a different order when you iterate over the map.

- They do not allow duplicate keys, which means that you cannot have two elements with the same key in the same map.

- They do not provide an index-based way of accessing the elements. This means that you cannot
access or update a specific element in the map using an index like you can with an array or a list.
 */

package com.lioneltlynch.algorithms.dataStructures;

public class MapDs {
    /*
    private static void hashMap() {
        Map<Main.Person, Main.Metal> map = new HashMap<>();
        map.put(new Main.Person("James"), new Main.Metal("Gold"));

        System.out.println(new Main.Person("James").hashCode());
        System.out.println(new Main.Person("James").hashCode());
        System.out.println(map.get(new Main.Person("James")));
    }

    record Person(String name){}
    record Metal(String name){}

    private static void map() {
        Map<Integer, Main.Person> map = new HashMap<>();
        map.put(1, new Main.Person("John"));
        map.put(2, new Main.Person("Luke"));
        map.put(3, new Main.Person("Jacob"));
        map.put(4, new Main.Person("Matthew"));

        System.out.println(map.size());
        System.out.println(map.get(3));
        System.out.println(map.containsKey(3));
        System.out.println(map.keySet());
        System.out.println(map.entrySet());
        System.out.println(map.values());


        map.entrySet()
                .forEach(x -> System.out.println(x.getKey() + " " + x.getValue()));

        map.forEach((key, person) -> {
            System.out.println(key + " - " + person);
        });

        System.out.println(map.getOrDefault(5, new Main.Person("Default")));
    }
     */
}
