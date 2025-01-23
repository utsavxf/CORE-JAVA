public class Program_2 {
    /*
   CHECKED EXCEPTION: compile time exception (handled by compiler)
   UNCHECKED EXCEPTION: runtime exceptions

   COMMONLY OCCURRING EXCEPTION
   ->null pointer exception
   ->arithmetic exception
   ->illegal exception
   ->Array Index out of bound pointer exception

    as soon as an exception is there, and you have not handled it then program will end abruptly

    */


    public static void main(String[] args) {
        int a=6800;
        int b=0;
        try{
            int c=a/b;
            System.out.println("The result is: " + c);
            System.out.println("after error in try block");
        }

        finally {
            System.out.println("Exception is not caught but I still would execute");
        }

        System.out.println("Exception is not caught so I will not execute further");


    }
}
