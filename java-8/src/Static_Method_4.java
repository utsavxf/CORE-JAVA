
interface A1{
    static void sayHello(){
        System.out.println("Hello from class A1");
    }
}

class Child3 implements A1{
   //different from how child class have access to static method of parent class,but now we are talking about interface
  void sayHello(){ //no overriding here ,Child3 does not have access to the static method sayHello
      System.out.println("This is new implementation");
  }
}

public class Static_Method_4 {
    public static void main(String[] args) {
      //the static method inside interface can only be called by interface
        A1.sayHello();
        //we can also write main method inside interface as it's also a static method
    }
}
