public class Join_4 {
    //here we will be learning about the join method on thread
    public static void main(String[] args) {
        System.out.println("main is starting");
        Thread thread=new Thread(()->{
            System.out.println(Thread.currentThread());
        },"Our Thread");
        thread.start();
//        try{
//            thread.join();
//        }catch(InterruptedException e){
//            e.printStackTrace();
//        }
        System.out.println("main is exiting");

    }
}
