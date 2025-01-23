package List;

public class Vector {
    public static void main(String[] args) {
        java.util.Vector<String> vector = new java.util.Vector<>();
        vector.add("Car");
        vector.add("Bus");
        vector.add("Bike");
        System.out.println("Vector: " + vector);

        // Accessing
        System.out.println("Element at index 1: " + vector.get(1));

        // Modifying
        vector.set(1, "Truck");
        System.out.println("Modified Vector: " + vector);

        // Removing
        vector.remove(2);
        System.out.println("After Removal: " + vector);

        // Checking Capacity
        System.out.println("Capacity: " + vector.capacity());

        // Iterating
        System.out.println("Iterating:");
        for (String vehicle : vector) {
            System.out.println(vehicle);
        }
    }
}
