public class NestedTryCatch_7 {
    public static void main(String[] args) {
        // Outer try block
        try {
            System.out.println("Outer try block starts.");

            // Nested (inner) try block
            try {
                int[] arr = {1, 2, 3};
                System.out.println("Accessing element at index 5: " + arr[5]); // Throws ArrayIndexOutOfBoundsException
            } catch (ArithmeticException e) {
                System.out.println("Inner catch block: Array index out of bounds exception caught.");
            }

            // Code that will cause another exception
            int result = 10 / 0; // Throws ArithmeticException
            System.out.println("Result: " + result);

        } catch (ArithmeticException e) {
            System.out.println("Outer catch block: Arithmetic exception caught.");
        } finally {
            System.out.println("Outer finally block: Always executes, no matter what happens.");
        }

        System.out.println("Program continues after nested try-catch.");
    }
}
