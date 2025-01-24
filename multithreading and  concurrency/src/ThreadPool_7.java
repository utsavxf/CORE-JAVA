import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPool_7 {
    public static void main(String[] args) {
       //WITHOUT THREAD POOL
        for(int i=0;i<5;i++){
            Thread t=new Thread(()->{
                System.out.println("Thread executed by : "+Thread.currentThread().getName());
                try {
                    Thread.sleep(1000); // Simulate task
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            });
            t.start();
        }
        //we can clearly see above that there are 5 threads being used above from Thread-0 to Thread-5 ,JVM numbers them internally using a global thread counter

        //WITH USING THREAD POOL
        ExecutorService pool = Executors.newFixedThreadPool(3); // 3 threads in the pool

        for (int i = 1; i <= 5; i++) {
            pool.execute(() -> {
                System.out.println("Task executed by " + Thread.currentThread().getName());
                try {
                    Thread.sleep(1000); // Simulate task
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            });
        }
        pool.shutdown();
        //above only 3 threads are being used as we have fixed the number to 3 and note after completing as task they are not being destroyed,rather sent back to the thread pool for later use

        //so it is more efficient and also there is less overhead as compared to above where threads are being created and destroyed frequently
    }
}
