package com.company;

import java.util.Iterator;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
	// Write a Java program to append the specified element to the end of a linked list.
        LinkedList<String> myList = new LinkedList<>();
        myList.add("cat");
        myList.add("dog");
        myList.add("hamster");
    // Write a Java program to iterate through all elements in a linked list
        for(String s : myList){
            System.out.println(s);
        }
        System.out.println("...............");
    //Write a Java program to iterate a linked list in reverse order.
        Iterator iterator = myList.descendingIterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println("...............");
    //Write a Java program to insert the specified element at the specified position in the linked list.
        int position = 1;
        myList.add(position, "doggo");
        for(String s : myList){
            System.out.println(s);
        }

    }
}
