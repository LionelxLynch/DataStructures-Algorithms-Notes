// Author: Lionel Lynch
// File Name: SetDS.java

/*
A Set in Java is a collection of elements that does not allow duplicate values.
It is an interface that extends the Collection interface and is implemented by several classes,
including HashSet, LinkedHashSet, and TreeSet.

Some pros of using Sets in Java are:

Pros
- They do not allow duplicate values, which can be useful in situations where you want to
ensure that each element in the set is unique.

- Sets can be used to test membership, add or remove elements, and perform various set operations
such as intersection, union, and difference.

- They are efficient for adding, removing, and checking the membership of elements.

Some cons of using Sets in Java are:

Cons
- They do not preserve the insertion order of the elements. This means that the order in which the elements were added
to the set is not maintained, and the elements may be returned in a different order when you iterate over the set.

- They do not provide an index-based way of accessing the elements.
This means that you cannot access or update a specific element in the set using an index
like you can with an array or a list. Sets do not allow you to retrieve elements in a specific order. If you need to do this,
you will need to use a different data structure such as a List or a TreeSet, which is a sorted set implementation.
 */

package com.lioneltlynch.algorithms.dataStructures;

public class SetDS {
    /*
    Set<Main.Ball> balls = new HashSet<>();
        balls.add(new Ball("Blue"));
        balls.add(new Ball("Green"));
        balls.add(new Ball("Red"));
        balls.add(new Ball("Red"));
        balls.remove(new Ball("Red"));

        System.out.println(balls.size());
        balls.forEach(System.out::println);
}

static class Ball{
    String color;
    public Ball(String color) {
        this.color = color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SetDS.Ball ball = (SetDS.Ball) o;
        return Objects.equals(color, ball.color);
    }
    @Override
    public int hashCode() {
        return Objects.hash(color);
    }

    @Override
    public String toString() {
        return "Ball{" +
                "color='" + color + '\'' +
                '}';
    }
}
//static record Ball(String color){}

     */
}

