package Learning.Collections;

import java.util.ArrayList;
import java.util.List;

public class Q4_ListInterfaceImplementations {
    public static void main(String[] args) {
        //creating a string
        List<String> list = new ArrayList<>();

        //adding elements to the list
        list.add("Java");
        list.add("Python");
        list.add("C++");
        list.add("JavaScript");
        list.add(1,"GO");
        list.add("Java");

        /*
        NOTE:If we try to add element at index 1 before adding elements at index 0 it will throw an error.
        It is always recommended to add elements in a particular index
        only when the size is defined or to add them sequentially.
         */

        System.out.print("List Elements:");

        //iterate through the list
        list.forEach(element -> System.out.print(element + "-"));

        //access the elements in the list
        System.out.println("\nElement at index 1 :" + list.get(1));

        //update the elements in the list
        list.set(0,"JavaScript");
        list.set(3,"Java");
        list.forEach(element -> System.out.print(element + "-"));

        System.out.print("\n");
        //removing elements
        list.remove("C++"); // remove based on element
        list.remove(1); // remove based on index
        list.forEach(element -> System.out.print(element + "-"));

        //get the first occurrence of an element
        System.out.println("\nIndex of Java:" + list.indexOf("Java"));

        //get the last occurrence of an element
        System.out.println("Last Index of Java:" + list.lastIndexOf("Java"));
    }
}
