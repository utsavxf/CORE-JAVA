import java.util.Scanner;

public class Program_3 {
 //HANDLING SPECIFIC EXCEPTIONS LIKE ARITHMETIC OR ARRAY INDEX OUT OF BOUND
 public static void main(String[] args) {
     int [] marks=new int[3];
     marks[0]=7;
     marks[1]=56;
     marks[2]=6;
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter the array index and by which number you want to divide it");
     int ind=sc.nextInt();
     int num=sc.nextInt();
     try {
         System.out.println("The value at array index is "+marks[ind]);
         System.out.println("The value of array-value/number  is "+marks[ind]/num);
     }catch (ArithmeticException e){  //this the general way of dealing with exceptions
         System.out.println("Arithmetic Exception");
         System.out.println(e);
     }catch (ArrayIndexOutOfBoundsException e){
         System.out.println("Array Index Out of Bound Exception");
     }catch (Exception e){
         System.out.println("Some other Exception has occurred");
         System.out.println(e);
     }
 }
}
