import java.util.function.Predicate;

public class Predicate_1 {
    public static void main(String[] args) {

        //Predicate --> Functional interface (Boolean valued function)
        //contains a method test which return true
        Predicate<Integer> isEven= x->x%2==0;  //this is called functional programming,we are treating the function as a local variable
        boolean test = isEven.test(4);
        System.out.println(test);

       Predicate<String>isWordStartingWithA=x->x.startsWith("A");
        System.out.println(isWordStartingWithA.test("Apple"));

    }
}