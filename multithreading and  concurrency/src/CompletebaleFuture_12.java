
import java.util.concurrent.CompletableFuture;
public class CompletebaleFuture_12 {
    public static void main(String[] args) {
        System.out.println("Starting main thread...");

        // Asynchronous task that returns a result
        CompletableFuture<String> future = CompletableFuture.supplyAsync(() -> {
            System.out.println("Running task in: " + Thread.currentThread().getName());
            try {
                Thread.sleep(2000); // Simulate long computation
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return "Task Result";
        });

        // Retrieve the result of the future
        String result = future.join(); //main thread will wait for it's execution similar to normal threads
        //there is also a get method but for that you need to handle exception handling
        System.out.println("Result: " + result);

        System.out.println("main thread exiting");

        //then there are some more methods  on completable future,do later
    }
}
