package HashMap1;

import java.util.HashMap;

public class HashMap_ {
    public static void main(String[] args) {
        HashMap<Integer, Integer> m1 = new HashMap();
        m1.put(1, 1);
        m1.put(3, 4);
        m1.put(5, 8);
        System.out.println(m1);

        // Accessing
        System.out.println("Value for key 2: " + m1.get(2));

        // Removing
        m1.remove(1);
        System.out.println("After Removal: " + m1);

        // Iterating
        System.out.println("Iterating:");
        for (var entry : m1.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}
