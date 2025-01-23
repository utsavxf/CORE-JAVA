package Set;

import javax.management.MBeanAttributeInfo;

/*
DIFF BW HASH SET AND TREE SET

HashSet
Implementation: Uses a hash table internally.
Order: No specific order is guaranteed (insertion order is not preserved).
Duplicates: Does not allow duplicate elements.
Performance: Generally faster for most operations (add, remove, contains) due to constant-time complexity (O(1) on average).
Null elements: Allows one null element.

TreeSet
Implementation: Uses a self-balancing binary search tree (typically a red-black tree).
Order: Stores elements in sorted order (natural order or custom comparator).
Duplicates: Does not allow duplicate elements.
Performance: Slower than HashSet for basic operations (add, remove, contains) due to logarithmic time complexity (O(log n)).
Null elements: Does not allow null elements.
*/
import java.util.TreeSet;
public class TreeSet_ {
    public static void main(String[] args) {
        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add("Apple");
        treeSet.add("Banana");
        treeSet.add("Cherry");
        System.out.println("TreeSet: " + treeSet);

        // First and Last Elements
        //notice that we cannot do this in case of normal hashset as there it is not ordered
        System.out.println("First Element: " + treeSet.first());
        System.out.println("Last Element: " + treeSet.last());

        // Removing
        treeSet.remove("Banana");
        System.out.println("After Removal: " + treeSet);

        // Iterating
        System.out.println("Iterating:");
        for (String fruit : treeSet) {
            System.out.println(fruit);
        }
    }
}
