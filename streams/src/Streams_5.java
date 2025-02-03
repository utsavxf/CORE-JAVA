import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Streams_5 {
    public static void main(String[] args) {
        //feature introduced in Java 8
        //process collections of data in a functional and declarative manner
        //simplify  data processing
        //embrace functional programming
        //improve readability and maintainability

        //What is a stream?
        //a sequence of elements supporting functional and declarative programming

        //How to Use Streams ?
        //Source,intermediate operations & terminal operations

        List<Integer> numbers= Arrays.asList(1,2,3,4,5);

        //PROBLEM:count the number of even numbers in the above list
        //TRADITIONAL METHOD:
        int cnt=0;
        for(Integer x:numbers){
            if(x%2==0)cnt++;
        }

        //USING STREAMS (easily in 1 line) that is the advantage of using streams
        long count = numbers.stream().filter(x -> x % 2 == 0).count();
        //here list(numbers) is a source,filter is the intermediary operation and count is the terminal operation

        //CREATING STREAMS
        //1. from Java Collections(List,Set,HashMap)
        //2. from Arrays
        String []array={"a","b","c"};
        Stream<String>stream1=Arrays.stream(array);
        //3. Using stream.of()
        Stream<String>stream2=Stream.of("a","b");
        //Infinite Streams
        Stream<Integer> generate= Stream.generate(() -> 1).limit(100); //stream of 100 1's




    }
}
