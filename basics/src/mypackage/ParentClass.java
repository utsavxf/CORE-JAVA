package mypackage;

public class ParentClass {
    public int publicValue=1;
    private int privateValue=2;
    protected int protectedValue=3;
    int defaultValue=4;

    public void display(){ //made this method public so we can call it from anywhere
        System.out.println("Public Value: " + publicValue);
        System.out.println("Private Value: " + privateValue);
        System.out.println("Protected Value: " + protectedValue);
        System.out.println("Default Value: " + defaultValue);
    }
}
