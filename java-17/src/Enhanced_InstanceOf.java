/*
Before this enhancement, you needed to explicitly check the type of an object using instanceof and then perform a type cast to access its methods or properties. This often resulted in verbose and repetitive code.
With the enhanced instanceof, Java combines type-checking and type-casting into a single step. When the condition is true, it automatically casts the object to the specified type, making the code cleaner and less error-prone.

*/

public class Enhanced_InstanceOf {
    public static void main(String[] args) {

       //Before enhanced instance of
        Object obj = "Hello, Java!";

        // Traditional instanceof with explicit casting
        if (obj instanceof String) {
            String s = (String) obj; // Explicit casting required
            System.out.println("String value: " + s.toUpperCase());
        } else {
            System.out.println("Not a String!");
        }


      //AFTER ENHANCED INSTANCE OF

      Object ob="Hello";
      if(ob instanceof String str){
          System.out.println(str);  //this is enhanced instance of if it matches we can directly use the str variable name
      }else{
          System.out.println("Not matched");
      }

      /*
      Scope of the Variable:
      The variable (s in the above example) is only available within the block where the condition evaluates to true.
      Once the block ends, the variable goes out of scope
      */


    }
}
