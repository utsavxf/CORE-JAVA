
//EXCEPTION PROPAGATION

public class Exception_Propagation_6 {

    void a()throws Exception{
        int a=50/0;
    }

    void b() throws Exception{
        a();
    }

    void c(){
        try{
            b();
        }catch (Exception e){
            System.out.println("Exception is caught");
        }
    }





    public static void main(String[] args) {
        Exception_Propagation_6 obj=new Exception_Propagation_6();
        obj.c();
    }
}
