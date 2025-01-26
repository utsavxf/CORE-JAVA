/*
PATTERN MATCHING

What is a pattern?
In simple terms, a pattern is a way of describing a structure or behavior in data so we can check for it, match it, or even extract information from it. Think of it like saying:
"Hey, if you see something shaped like this, do that with it!

Patterns in Java
Patterns are used to match types or values in your code. For example:

Type Pattern
Checks if something is of a certain type and gives you access to it directly.
Example: if (obj instanceof String s)

Value Pattern
Matches specific values (like constants).
Example: case 42 -> (for the number 42)


*/


public class Patter_Matching_Switch {

    public static String describe(Object obj1) {
        return switch (obj1) {
            case Integer i -> "It's an Integer with value: " + i;
            case String s -> "It's a String with value: \"" + s + "\"";
            case null -> "It's null!";
            default -> "Unknown type!";
        };
    }

    public static void main(String[] args) {
        Object obj = "Hello, Pattern!";

        // Pattern matching using instanceof
        if (obj instanceof String s) {
            // Automatically casts obj to String and assigns to 's'
            System.out.println("String value: " + s.toUpperCase());
        } else {
            System.out.println("Not a String!");
        }

        //Patterns + Switch = Magic
        //Patterns get super spicy when combined with the new switch in Java. Instead of just checking for values, you can now match types, values, and conditions directly.

            System.out.println(describe(42));        // It's an Integer with value: 42
            System.out.println(describe("Java"));   // It's a String with value: "Java"
            System.out.println(describe(null));     // It's null!
            System.out.println(describe(3.14));     // Unknown type!

    }
}
