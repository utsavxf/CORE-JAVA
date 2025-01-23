//THROWS KEYWORD


class  NegativeRadiusException extends Exception{
    @Override
    public String toString() {
        return "Radius cannot be negative\n";
    }

    @Override
    public String getMessage() {
        return "Radius cannot be negative\n";
    }
}



public class Program_5 {
    public static float area(int r) throws NegativeRadiusException{
        if(r<0){
            throw  new NegativeRadiusException();
        }
        float result= (float) (Math.PI*r*r);
        return result;
    }
    public static int divide(int a,int b) throws ArithmeticException{ //we are telling that whosoever  is using this function,be aware as it throws an exception
        //made by harry
        return a/b;
    }

    public static void main(String[] args) {
        //Shivam uses divide function created ny Harry
        try {
            int c = divide(4, 0);
        } catch (Exception e) {
            System.out.println("An exception occurres");
        }

//        System.out.println(area());
    }
}
