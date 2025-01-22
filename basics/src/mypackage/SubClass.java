package mypackage;
import mypackage.ParentClass;
//accessing from subclass in same class
public class SubClass extends ParentClass {
     public void show(){
         System.out.println("Accessing from subclass in same package");
         System.out.println("Public Value: " + publicValue);
//         System.out.println("Private Value: " + privateValue); gives error can't use this
         System.out.println("Protected Value: " + protectedValue);
         System.out.println("Default Value: " + defaultValue);
    }

    public static void main(String[] args) {
        SubClass s=new SubClass();
        s.show();
    }
}


