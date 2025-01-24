import java.util.concurrent.*;
public class FutureInterface_11 {
    public static void main(String[] args) {
        /*

        The Future interface represents the result of an asynchronous computation. It provides methods to check if the computation is complete, wait for its completion, and retrieve the result of the computation.
        When you submit a task to an ExecutorService using the submit() method, a Future object is returned, which you can use to interact with the task.

        boolean cancel(boolean mayInterruptIfRunning)	Attempts to cancel the execution of the task.
        boolean isCancelled():Returns true if the task was cancelled before it completed.
        boolean isDone():	Returns true if the task has completed, whether successfully, cancelled, or with an exception.
        V get():Waits if necessary for the task to complete and then retrieves its result.
        V get(long timeout, TimeUnit unit):Waits for at most the specified time for the task to complete and then retrieves its result.If not completed in that time then returns exception
        */
        // Create a thread pool
        ExecutorService executor = Executors.newFixedThreadPool(2);

        // Callable task that returns a result
        Callable<String> callableTask = () -> {
            Thread.sleep(2000); // Simulate a long-running task
            return "Task Completed!";
        };

        System.out.println("Submitting task to executor...");

        // Submit the task and get a Future object
        Future<String> future = executor.submit(callableTask);

        try {
            // Check if the task is done
            while (!future.isDone()) {
                System.out.println("Task is still running...");
                Thread.sleep(500); // Polling
            }

            // Retrieve the result of the computation
            String result = future.get(); // This blocks all other threads until the task is complete
//            String result = future.get(0,TimeUnit.SECONDS); // This blocks all other threads until the task is complete
            System.out.println("Task Result: " + result);
        } catch ( InterruptedException | ExecutionException e) {
            e.printStackTrace();
        } finally {
            executor.shutdown();
        }
    }
}
