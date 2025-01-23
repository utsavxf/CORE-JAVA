package List;

import java.util.Collections;

public class ArrayList {
    public static void main(String[] args) {
        java.util.ArrayList<String> a1=new java.util.ArrayList<>();
        a1.add("One");
        a1.add("Two");
        a1.add("Three");
        System.out.println("List till now is: "+a1);
        a1.set(1,"BlueBerry");
        System.out.println(a1);
        a1.remove(0);
        System.out.println(a1);
        //note that here we are using wrapper classed for each primitive datatype also as collections only work with objects
        //so these wrapper classes converts each primitive datatype into object
        java.util.ArrayList<Integer> a2=new java.util.ArrayList<>();
        a2.add(34);
        a2.add(3);
        a2.add(5);
        System.out.println("Before Sorting: "+a2);
        Collections.sort(a2);
        System.out.println("After Sorting: "+a2);

    }
}
