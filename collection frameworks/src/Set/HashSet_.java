package Set;
import java.util.HashSet;

public class HashSet_ {
    public static void main(String[] args) {
      HashSet<String>h1=new HashSet<>();
      h1.add("A");
      h1.add("B");
      h1.add("C");
      h1.add("D");
      h1.add("E");
      h1.add("F");
      h1.add("G");
      h1.add("H");
      System.out.println(h1);
      h1.add("A"); //duplicate ignored
      System.out.println(h1);
      System.out.println("Contains B? "+h1.contains("B"));
      //removing
      h1.remove("A");
      System.out.println(h1);

      //iterating each element specifically
      for(String s:h1){
         System.out.println(s);
      }
    }
}
