import java.util.Arrays;

public class Arrays_4 {

    static void change(int arr1[]){
        for(int i=0;i<arr1.length;i++){
            arr1[i]=1;
        }
    }

    static void changePrimitive(int a){
        a=10;
    }
    public static void main(String[] args) {
        int []arr1;
        int arr2[]; //both ways are valid but this one is less preferred as compared to above
        arr1=new int[5];
        //Object Allocation: All objects in Java are dynamically allocated on the heap. This is managed by the Java Virtual Machine (JVM)
        arr1[0]=12;
        arr1[1]=2;
        arr1[2]=11;
        arr1[3]=1;
        arr1[4]=32;
        Arrays.sort(arr1);
        for (int i=0;i<arr1.length;i++){
            System.out.println(arr1[i]);
        }
        change(arr1);
        System.out.println("After changing");
        for (int i=0;i<arr1.length;i++){
            System.out.println(arr1[i]);
        }
        //CALL BY VALUE VS CALL BY REFERENCE
        //For primitive data types (like int, double, char), passing arguments to a method creates a copy of the value.
        //For objects (like arrays, Strings, custom classes), you pass a reference to the object itself.
        int temp=34;
        changePrimitive(temp);
        System.out.println("After changing\n"+temp);
    }
}
