package Learning.Collections;

import java.util.ArrayList;
import java.util.Collection;

/*
removeAll(Collection<?> c) : Removes all of this collection’s elements that are also contained in the specified collection (optional operation).
 */
public class Q3_RemovingElementsFromACollection {
    public static void main(String[] args) {
        Collection<Integer> list1 = new ArrayList<>();
        list1.add(10);
        list1.add(15);
        list1.add(20);
        list1.add(25);
        list1.add(30);

        System.out.println("Initial List:" + list1);

        list1.remove(25);
        System.out.println("List after removing 25 :" + list1);

        Collection<Integer> list2 = new ArrayList<>();
        list2.add(10);
        list2.add(15);
        list2.add(20);

        System.out.println("Collection to be removed :" + list2);
        list1.removeAll(list2);
        System.out.println("Collection after removeAll:" + list1);
    }
}