/*
WE'LL BE ANSWERING 4 BASIC QUESTIONS
Can static methods be inherited
Can static methods be overriden
Can static methods be overloaded
Can static methods be called by creating objects of parent or child class
*/

class Parent{
    static void  display(){
        System.out.println("Displaying in Parent class");
    }
}

class Child1 extends Parent{

}

class Child2 extends Parent{
    static void display(){
        System.out.println("Displaying in Child2");
    }
}

class Child3 extends Parent{
    static void display(){
        System.out.println("Displaying in Child3");
    }

    static void display(String name){
        System.out.println("Displaying in Child3 with string parameter: "+name);
    }

    static void display(int num){
        System.out.println("Displaying in Child3 with integer parameter: "+num);
    }
}


public class Static {
    public static void main(String[] args) {
      Parent.display();
      Child1.display();
      //in the above we can see that static method is not inherited by yes accessible by the child class
      Parent p1=new Parent();
      p1.display();
      //we can class static method by creating an object but it is not advised

      Child2.display();
      //we can see we will not call it overriding but method hiding as Parent class static method is hidden
      Parent p2=new Child2();
      p2.display();//see no method overriding is there as static class is attached to class

      Child3.display();
      Child3.display("Utsav");
      Child3.display(28);
      //thus we can clearly see that static  methods can be overloaded

      //SUMMARY
/*
 Can static methods be inherited?	No, but they are accessible through the subclass.
Can static methods be overridden?	No, they can only be hidden (method hiding).
Can static methods be overloaded?	Yes, you can define multiple static methods with the same name but different parameters.
Can static methods be called using objects?	Yes, but it's not recommended. They should be called using the class name.
*/


    }
}
