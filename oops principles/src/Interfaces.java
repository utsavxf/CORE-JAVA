
//An interface is a blueprint of a class that specifies a set of methods that a class must implement
//Variables defined in an interface are implicitly public, static, and final
//All methods in interfaces are inherently abstract and all classes the implements these interfaces must provide an implementation for these until in later versions it also supports default,static and private methods
//One of the biggest feature of interfaces is that it supports multiple inheritance

interface Person{
    int IQ=200;
    default void speak(){
        System.out.println("Hi I speak Hindi Language");
    }

    static void info(){
        System.out.println("I am a person from Milky Way");
    }
    abstract void color();

    static void greet(){
        System.out.println("Hi I am Person");
    }
}

interface Alien{
    int IQ=300;
    default void speak(){
        System.out.println("Hi I speak TingTong Language");
    }

    static void info(){
        System.out.println("I am a person from Silky Way");
    }
    abstract void color();
    static void greet(){
        System.out.println("Hi I am Alien");
    }
}

class Utsav implements Person,Alien{
    public void color(){
        System.out.println("I am brown in color");
    }
    public void speak(){ //here also while working with default methods ambiguity can arrive and in that case you can do 1 of the 3 and
        Person.super.speak();
        Alien.super.speak();
        System.out.println("I am giving my own implementation");
    }

    static void greet(){  //obviously there will be no ambiguity in case of static methods as they are related to classes not to objects
        System.out.println("Hi I am Utsav");
    }
}

public class Interfaces {
    public static void main(String[] args) {
        Utsav u1=new Utsav();
        u1.speak();
        u1.color();
        Person.greet();
        Alien.greet();
        Utsav.greet();
    }
}
