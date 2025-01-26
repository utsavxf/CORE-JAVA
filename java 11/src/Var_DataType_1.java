/*
var is a reserved type name introduced in Java 10 that allows you to declare local variables without explicitly specifying their type.
The compiler infers the type of the variable based on the initializer expression on the right-hand side.

RESTRICTIONS
var can only be used for local variables. It cannot be used for:
->Instance variables (class members)
->Method parameters
->Return types of methods
The variable declaration must have an initializer. The compiler needs the initializer to infer the type.
var cannot be initialized with null without an explicit type declaration.

IN JAVA 11
In Java 11, the use of var was extended to lambda expressions. It allows you to declare the types of lambda parameters using var.
This improves code readability, especially when annotations are required for parameters.

*/

import java.util.List;
import java.util.stream.Collectors;

public class Var_DataType_1 {
    public static void main(String[] args) {
//       var name="Utsav";
//       var age=21;
//       System.out.println("My name is : "+name+" and my age is: "+age);

        List<String> names = List.of("Alice", "Bob", "Charlie");

        // Lambda with explicitly declared types
        List<String> upperCaseNames = names.stream()
                .map((String name) -> name.toUpperCase())
                .collect(Collectors.toList());

        // Lambda using 'var'
        List<String> upperCaseNamesVar = names.stream()
                .map((var name) -> name.toUpperCase())
                .collect(Collectors.toList());

        System.out.println("Uppercase Names: " + upperCaseNamesVar);

        /*
        var is particularly useful when annotations are needed on lambda parameters.
        eg. .map((@Nullable var name) -> name.toUpperCase());

        You cannot mix var with explicit types in the same lambda expression.
        If you use var, it must be used for all parameters in the lambda.
        */

    }
}