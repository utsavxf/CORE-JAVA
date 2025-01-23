//EXCEPTION CLASSES IN JAVA
//exception is a predefined class in java ,we can extend it and make our own exception class

/*The exception class has following important methods
 * ->String toString()       executed when sout(e) is ran
 * ->void printStackTrace()       prints Stack trace
 * ->String getMessage()         prints the Exception message
 * */

import java.util.Scanner;
class MyException extends Exception{
    @Override
    public String toString() {
        return super.toString()+ "I am toString()";
    }

    @Override
    public String getMessage() {
        return  "Your Number must be greater than 8 ";
    }
}



public class CustomException_4 {
    public static void main(String[] args) {
        System.out.println("Enter a number");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        if(a<9){
            try{
                throw new MyException();
            }catch (Exception e){
                System.out.println(e.getMessage());
                e.printStackTrace();
            }
        }
    }
}

/*
throw keyword hum tab use karte hai jab we want to throw our own custom exception
like in the above case we want that if a<9 then do this
e.g. you are making a square and someone input negative dimension then we want to throw an exception
*/
