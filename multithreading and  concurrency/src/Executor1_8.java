import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class Executor1_8 {

    private static long factorial(int n){
        if(n==0 || n==1)return 1;
        return n*factorial(n-1);
    }

    public static void main(String[] args) {
        //we don't need to manually create 9 different threads for completing this task
        //now you may ask why use threads in the first place,do it sequentially no?why shouldn't we take advantage of multithreading,compare yourself and see which one is fast
        ExecutorService executor= Executors.newFixedThreadPool(3);
        for(int i=1;i<10;i++){
            int finalI=i;
           Future<?>future= executor.submit(()->{ //return an object of type future
                long result=factorial(finalI);
                System.out.println(result);
            });
        }
        executor.shutdown(); //new tasks cannot be submitted now and begin shutdown of every thread

        try{
            executor.awaitTermination(100, TimeUnit.SECONDS);
            //wait until all are shut down
        }catch (InterruptedException e){
            e.printStackTrace();
        }


    }
}
