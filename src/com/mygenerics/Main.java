/**
 *  Java program to use wild card super with List.
 */

package com.mygenerics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *  A class.
 */
class A {}

/**
 *  B class.
 */
class B extends A {}

/**
 *  Main class.
 */
public class Main {

    // JVM entry point.
    public static void main(String[] args) {

        // Creating a list with wild card super.
        List<? super A> list = new ArrayList<>();

        // Adding elements to the list.
        list.add(new A());
        list.add(new B());
        list.add(new A());
        list.add(new B());

        // Calling method wildCardDemo() list with types of storing data A and B.
        wildCardDemo(list);

    }

    // Method to print elements of lists with wildcard type.
    static void wildCardDemo(List<?> list) {
        for (Object o : list) {
            System.out.println("The item is: " + o);
        }
    }
}
