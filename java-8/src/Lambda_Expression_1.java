/*
THEORY
Lambda expressions allow you to write concise, anonymous functions that can be passed as arguments to methods or stored in variables.
This enabled functional programming paradigms in Java, making code more expressive and readable.

ok now tell me if I am wrong or right,so in languages which are functional programming languages,functions can be treated as first-class citizens,
means they can be assigned to variables,can be passed as parameter to other functions or can also be returned from other functions,like in C++ if we want to sort something like a vector let's say based on length ,we can easily pass a comparator function to it and then do this
but in Java before Java 8 if we had to do something like this,you know in Java everything is inside a class you cannot write a comparator function from nowhere,it has to be method of some class,so what we did is overwrite a method of some anonymous class and  then write the logic but
after the introduction of lambda expressions we can directly write the logic in the lambda function and  it can also be treated as first-class citizen
*/


import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Lambda_Expression_1 {
    public static void main(String[] args) {

        //before lambda expressions
        List<String> words = Arrays.asList("apple", "banana", "kiwi");

        // Anonymous inner class for comparator
        Collections.sort(words, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return Integer.compare(s1.length(), s2.length());
            }
        });

        //after lambda expressions
        List<String> words1 = Arrays.asList("apple", "banana", "kiwi");

        // Lambda expression for comparator
        words1.sort((s1, s2) -> Integer.compare(s1.length(), s2.length()));

        System.out.println(words); // [kiwi, apple, banana]

        /*
         Lambda Expressions vs Anonymous Classes
        Why are lambda expressions better than anonymous inner classes?

        Conciseness: Lambdas are shorter and easier to read.
        No overhead: Lambdas don’t create anonymous inner class objects.
        Functional style: They align Java more closely with functional programming paradigms
        */




    }
}
