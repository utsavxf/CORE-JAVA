import java.util.function.Function;

public class Function_2 {
    public static void main(String[] args) {
        //Function->functional interface which works for you
        //also return something
        Function<Integer,Integer>doubleIt=x->2*x;
        Function<Integer,Integer>tripleIt=x->3*x;
        //first parameter indicates what it is going to take(Integer),second parameter indicates what it is going to return
        //abstract method is only 1 which is apply
        System.out.println(doubleIt.apply(34));
        //the below andThen method is the default one
        System.out.println(doubleIt.andThen(tripleIt).apply(2));

        //static method
        Function<Object, Object> identity = Function.identity();
        identity.apply(34); //jo input me doge wo hi output me aajayega,damn

    }
}
