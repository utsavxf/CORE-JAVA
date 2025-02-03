import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Streams_6 {
    public static void main(String[] args) {
        //Intermediate operations transform a stream into another streams
        //They are lazy,meaning they don't execute until a terminal operation is invoked

        //FILTER
        List<String> list = Arrays.asList("Akshit", "Ram", "Shyam", "Ghanshyam");
        Stream<String> filteredStream = list.stream().filter(x -> x.startsWith("A"));
        System.out.println(filteredStream);
        //NO FILTERING HAS BEEN DONE AT THIS POINT AS NO TERMINAL OPERATION HAS BEEN PERFORMED
        // Terminal operation: collect the filtered results into a list.
        List<String> filteredList = filteredStream.collect(Collectors.toList());
        System.out.println(filteredList);

        //MAP
        Stream<String> stringStream1 = list.stream().map(x -> x.toUpperCase());
        //we can also replace the above with method reference
        Stream<String> stringStream2 = list.stream().map(String::toUpperCase);

        //SORTED
        Stream<String> sortedStream = list.stream().sorted();
        Stream<String> sortedStreamUsingComparator = list.stream().sorted((a, b) -> a.length() - b.length()); //this sorts in ascending order,if you want in descending then b-a
        
        //then there are more operations like distinct,limit

        //TERMINAL OPERATIONS 

        List<Integer> list2 = Arrays.asList(1, 2, 3);
        
        //1. collect
        List<Integer> collect1 = list2.stream().skip(1).collect(Collectors.toList());
        //in newer java versions we can also write it like
        List<Integer> collect2 = list2.stream().skip(1).toList();

        //2. forEach
        list2.stream().forEach(x-> System.out.println(x));

        //3. reduce :combines elements to produce a single result
        list2.stream().reduce((x,y)->x+y); //sum of all elements

    }
}
