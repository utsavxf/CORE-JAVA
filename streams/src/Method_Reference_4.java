import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Method_Reference_4 {
    public static void main(String[] args) {
        //Method reference --> use method without invoking & in place of lambda expression
        List<String> students = Arrays.asList("Ram", "Shyam","Ghanshyam");
        students.forEach(System.out::println); //what is this double column
        
        //Constructor reference 
        List<String> names = Arrays.asList("A", "B", "C");
        List<MobilePhone>mobilePhones= names.stream().map(MobilePhone::new).collect(Collectors.toList());
    }
}

class MobilePhone{
    String name;
    public MobilePhone(String name){
        this.name=name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
