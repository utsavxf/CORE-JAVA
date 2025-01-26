
interface Parent{
    default void sayHello(){
        System.out.println("Hello");
    }
}

class Child1 implements Parent{

}
//we can also override this method
class Child2 implements Parent{
    @Override
    public void sayHello() {
        System.out.println("Child 2 says Hello");
    }
}


//SEEING THE AMBIGUITY DUE TO MULTIPLE INHERITANCE
interface A{
    default void greet(){
        System.out.println("Greeting from A");
    }
}
interface B{
    default void greet(){
        System.out.println("Greeting from B");
    }
}

class Utsav implements A,B{
    //you have to override for sure to remove ambiguity
    @Override
    public void greet() {
     //now after overriding either you
//        A.super.greet();
//        A.super.greet();
     //or you provide your implementation
        System.out.println("Provided my own implementation to escape ambiguity");
    }
}
public class Default_Methods_3 {
    public static void main(String[] args) {
        Child1 c1=new Child1();
        c1.sayHello();
        Child2 c2=new Child2();
        c2.sayHello();
        Utsav u1=new Utsav();
        u1.greet();
    }
}
