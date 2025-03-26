package Learning.Collections;

/*
There are three ways in which objects of Iterable can be iterated.

1. Using enhanced for loop(for-each loop)
2. Using Iterable forEach loop
3. Using Iterator<T> interface
 */

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Q1_IterableInterface {
    public static void main(String[] args) {
       List<String> listOfItems = new ArrayList<>();

       listOfItems.add("A");
       listOfItems.add("B");
       listOfItems.add("C");

       iterateUsingForEachLoop(listOfItems);
       iterateUsingForEachLambda(listOfItems);
       iterateUsingIteratorInterface(listOfItems);
    }

    private static void iterateUsingForEachLoop(List<String> listOfItems){
        System.out.print("Using enhanced for loop(for-each loop):");
        for(String element : listOfItems){
            System.out.print(element + " ");
        }
        System.out.println();
    }

    private static void iterateUsingForEachLambda(List<String> listOfItems){
        System.out.print("Using Iterable forEach loop:");
        listOfItems.forEach((element) ->
            System.out.print(element + " ")
        );

        System.out.println();
    }

    private static void iterateUsingIteratorInterface(List<String> listOfItems){
        Iterator<String> iterator = listOfItems.iterator();

        System.out.print("Using Iterator<T> interface:");
        while(iterator.hasNext()){
            System.out.print(iterator.next() + " ");
        }
    }
}
