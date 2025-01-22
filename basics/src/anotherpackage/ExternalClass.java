package anotherpackage;
import mypackage.ParentClass;
public class ExternalClass  extends  ParentClass{
    public static void main(String[] args) {
        ExternalClass e=new ExternalClass();
        System.out.println("Public Value: " + e.publicValue);
        //rest will not work but protected may still work if we make this class(ExternalClass) a subclass of ParentClass
//        System.out.println("Private Value: " + e.privateValue);
        System.out.println("Protected Value: " + e.protectedValue);
//        System.out.println("Default Value: " + e.defaultValue);
    }
}
