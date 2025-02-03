import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Consumer_Supplier_3 {
    public static void main(String[] args) {
        //Consumer->a functional interface which will only consume,does not return or give back anything
        Consumer<Integer>print=x-> System.out.println(x);
        print.accept(5);

        //Supplier->a functional interface which only gives,does not takes
        Supplier<String>giveHelloWorld=()->"hello World";
        System.out.println(giveHelloWorld.get());

        //combined example
        Predicate<Integer>predicate=x->x%2==0;
        Function<Integer,Integer> function= x->x*2;
        Consumer<Integer>consumer=x-> System.out.println(x);
        Supplier<Integer>supplier=()->100;

        if(predicate.test(supplier.get())){
            consumer.accept(function.apply(supplier.get()));
        }

        //then there are also functional interfaces which takes 2 arguments
        //BiPredicate,BiConsumer,BiFunction read about them later on your own



    }
}
