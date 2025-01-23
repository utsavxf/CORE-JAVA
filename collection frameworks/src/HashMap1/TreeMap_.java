package HashMap1;
import  java.util.TreeMap;
public class TreeMap_ {
    public static void main(String[] args) {
        TreeMap<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(3, "Three");
        treeMap.put(1, "One");
        treeMap.put(2, "Two");
        System.out.println("TreeMap: " + treeMap);

        // Removing
        treeMap.remove(2);
        System.out.println("After Removal: " + treeMap);

        // Iterating
        for (var entry : treeMap.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}
