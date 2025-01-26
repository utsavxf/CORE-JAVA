import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;



class MyComparator implements Comparator<Integer> {
    @Override
    public int compare(Integer o1, Integer o2) {
        // Sorting in descending order
        return o2 - o1;
       //if we would wanna sort in ascending order we would have written o1-o2
    }
}

public class Lambda_Expression_5 {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        list.add(34);
        list.add(3);
        list.add(4);
        list.add(14);
        list.add(1);
        //now we want to sort it
        //simple use inbuilt function
        Collections.sort(list);
        System.out.println(list);

        //but we want to sort in descending order,so for that you have to pass a comparator (which is a functional interface) to this Collections
        //WE CAN DO 3 THINGS

        //first make a class which implements that functional interface,create its object and then pass it to Collections.sort
        Collections.sort(list,new MyComparator());
        System.out.println(list);

        //we can also directly write the overriden method of Comparable inline by creating an anonymous inner class
        Collections.sort(list, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2-o1;
            }
        });

        //or since Comparator is a functional interface we can use lambda expressions as we already know now lambda expression internally are expanded to above code
        Collections.sort(list,(a,b)-> b-a);
    }
}
