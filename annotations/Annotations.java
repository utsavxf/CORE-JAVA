/*
WHAT IS ANNOTATION
Annotations in Java provide metadata for the code, offering information to the compiler and runtime.
They're not directly part of the program logic but help in various tasks such as compilation, deployment, and runtime processing

Annotations are preceded by the @ symbol and written above classes, methods, fields, or parameters.

Compiler Annotations
@Override: Indicates a method overrides a superclass method.
@Deprecated: Marks a class, method, or field as deprecated.
@SuppressWarnings: Suppresses compiler warnings for the annotated code.

*/

class Parent{
    public void greet(){
        System.out.println("hello");
    }
}

public class Annotations {
    public static void main(String[] args) {

    }
}
