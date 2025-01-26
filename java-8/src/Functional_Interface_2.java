/*
interface which has only 1 abstract method but can have any number of defaults or static methods,we don't care
This feature enables the use of lambda expressions to provide the implementation of the abstract method in a clean, concise manner.


*/

@FunctionalInterface  //message to compiler that it's a functional interface,cuz even if we add 2 abstract methods compiler will treat it as normal interface,but annotation tells the compiler and  restricts that there can only be 1 abstract method
 interface Employee{
    String getName();
}
class SoftwareEngineer implements Employee{
    @Override
    public String getName() {
        return "Software Engineer";
    }
}

public class Functional_Interface_2 {
    public static void main(String[] args) {
      Employee employee=new SoftwareEngineer();
      System.out.println(employee.getName());
      //this is one way

      //LAMBDA EXPRESSION AND  FUNCTIONAL INTERFACE GOES HAND IN HAND
      Employee employee1=()->{  //FUNCTIONAL INTERFACE ACTS AS DATATYPE FOR LAMBDA EXPRESSION
         return "Data Engineer";
      };

      System.out.println(employee1.getName());

      //I can say that lambda expression helps to write inline implementation of the single abstract method that is present in a functional interface ,we now don't need to first create a class ,then an object and then invoke that function ,we can simply write lambda expression which is of type Functional Interface

     //Yes, you can think of employee1 as an object that represents an instance of the Employee functional interface. However, it's not a typical object like one you'd create from a class; instead, it's an instance of a functional interface whose single abstract method is implemented using a lambda expression.

     //employee1 is an object of a class that is dynamically created by compiler ,we don't explicitly define it

     Employee hr=()-> "HR";
     System.out.println(hr.getName());


    }
}
