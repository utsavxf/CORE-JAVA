
interface Employee1{
    int getSalary();
    String getDesignation();
}

public class AnonymousInnerClass_6 {
    public static void main(String[] args) {
        Employee1 e1=new Employee1() {
            @Override
            public int getSalary() {
                return 122;
            }

            @Override
            public String getDesignation() {
                return "Developer";
            }
        };
        //above is an example of creating anonymous inner class
        System.out.println(e1.getSalary());
        System.out.println(e1.getDesignation());
    }
}
