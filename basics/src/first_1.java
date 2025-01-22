
//DATATYPES
/*
there are 2 types primitive and non-primitive

PRIMITIVE:- basic building blocks and are stored in the stack memory
->eg byte(1 byte),short(1 byte),int(4 byte),long(8 byte),float(4 byte),double(8 byte),char,boolean(1 bit)
->stored in stack so faster access
->no associated methods with them,cuz they aren't objects,that's we also say Java is not fully object oriented as to be 100% object oriented even datatypes have to be objects
->have default values 0 for int ,0.0 for double,false for boolean

NON-PRIMITIVE:-complex datatypes that represents objects,stored in heap memory
String: Represents a sequence of characters (e.g., "Hello", "world").
Array: Stores a collection of elements of the same data type.
Class: Represents a blueprint for creating objects.

->Slower: Accessing them involves dereferencing, which can be slightly slower.
->Methods: They have associated methods (e.g., String has methods like length(), charAt()).
->Can be null: They can hold the value null, indicating that no object is referenced.

primitive have direct access while non-primitive are accessed through referencing

 */


import java.util.Scanner;

public class first_1 {
    public static void main(String[] args) {

     //A CALCULATOR PROGRAM TO REVISE THE BASICS OF JAVA VARIABLES,OPERATORS,LOOPS,CONTROL FLOW
        boolean wannaPlay=true;
        Scanner sc=new Scanner(System.in);
        do {
            // Input numbers
            System.out.println("Enter 2 numbers:");
            int a = sc.nextInt();
            int b = sc.nextInt();

            // Input operator
            System.out.println("Enter the operation you want to perform (+, -, *, /):");
            char operator = sc.next().charAt(0);

            int ans = 0; // Initialize the answer

            // Perform the operation
            switch (operator) {
                case '+' -> ans = a + b;
                case '-' -> ans = a - b;
                case '*' -> ans = a * b;
                case '/' -> {
                    if (b != 0) {
                        ans = a / b;
                    } else {
                        System.out.println("Error: Division by zero is not allowed.");
                        continue; // Skip the rest and prompt the user again
                    }
                }
                default -> {
                    System.out.println("Invalid operator! Please try again.");
                    continue; // Skip the rest and prompt the user again
                }
            }

            // Output the result
            System.out.println("The result is: " + ans);

            // Ask if the user wants to continue
            System.out.println("Do you want to continue? (Y for yes, N for no):");
            char playAgain = sc.next().charAt(0);
            if (playAgain == 'Y' || playAgain == 'y') {
                wannaPlay = true;
                System.out.println("Let's play again!");
            } else {
                wannaPlay = false;
                System.out.println("Goodbye!");
            }
        } while (wannaPlay);
    }
}