
//WHY EXACTLY IS ABSTRACT CLASSES USED
//used mainly when we want to provide some common functionality to classes like

abstract class Shape{
   Shape(){
       System.out.println("Hi I am the parent class Shape");
   }
  public void info(){ //abstract class can have non-abstract functions too
      System.out.println("Hi this is a shape program");
  }
  abstract void area();
  abstract void perimeter();
}

class Triangle extends Shape{
    void area(){
        System.out.println("My area is 1/2*b*h");
    }
    void perimeter(){
        System.out.println("My perimeter is a+b+c ");
    }
}

class Square extends Shape{
    public void info(){
        super.info();  //super keyword refers to the parent class
        System.out.println("I am an overrided function to show method overrding in Java");
    }
    void area(){
        System.out.println("My area is a*a");
    }
    void perimeter(){
        System.out.println("My perimeter is 4*a ");
    }
}

public class Program_1 {
    public static void main(String[] args) {
//        Triangle t1=new Triangle();
//        t1.info(); //see that it will also call the parent class constructor
//        t1.area();
//        t1.perimeter();
//        Square s1=new Square();
//        s1.info(); //notice the use of super keyword here
//        s1.area();
//        s1.perimeter();

        //METHOD OVERRIDING
//        Shape s1=new Shape(); //gives error as you cannot make object of abstract class or we can say that you cannot instantiate abstract class
          Shape s1=new Triangle(); //we are creating a Triangle object but Shape is the reference type hence we can only call methods that are declared in Shape
          //WE CAN SIMPLY SAY THAT NOW s1 IS MADE TO ACT LIKE TRIANGLE
          s1.info();
          s1.area();
          s1.perimeter();

    }
}
