package Learning.Collections;

import java.util.ArrayList;
import java.util.Collection;

/*
addAll(Collection<? extends E> c) : Adds all the elements in the specified collection to this collection (optional operation).
 */
public class Q2_AddingElementsToACollection {
    public static void main(String[] args) {
        Collection<Integer> list1 = new ArrayList<>();

        list1.add(10);
        list1.add(15);
        list1.add(20);
        list1.add(25);
        list1.add(30);

        list1.forEach((element) -> System.out.print(element + " "));

        System.out.println();

        Collection<Integer> list2 = new ArrayList<>();
        list2.addAll(list1);

        System.out.println("New ArrayList: " + list2);
    }
}