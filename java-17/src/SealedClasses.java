
/*
So far we know there are abstract classes(which are meant to be inherited) and final classes(which are not meant to be inherited) but developers wanted something in between
Hence comes the idea of sealed classes and interfaces

Sealed classes, introduced in Java 17, provide a way to control which classes or interfaces can extend or implement a given class or interface.
They allow developers to create a restricted class hierarchy where the set of subclasses is explicitly defined and controlled.

Subclasses must explicitly declare how they relate to the sealed class:
final: Prevents further subclassing.
non-sealed: Allows unrestricted subclassing.
sealed: Continues the restriction with further control.

*/

sealed class A implements Cloneable permits B,C,D{
 void greet(){
     System.out.println("Hello from class A");
 }
}

final class B extends A{

}

sealed class C extends A permits E{

}

non-sealed class D extends A{

}

final class E extends C{

}

 class F extends D{

}


public class SealedClasses {
    public static void main(String[] args) {
        //if A is sealed and permits D and D is not-sealed then we can make another class F which can extends D
        F f=new F();
        f.greet();
    }
}