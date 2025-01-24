import java.util.concurrent.*;

public class Executor3_10 {
    public static void main(String[] args) {
        /*
        So you know there is Executor Interface and  ExecutorService Interface ,inside Executor we have just execute function() which doesn't return anything
        and inside Executor Interface there is submit function which returns a future object so now let's study about this submit function

        Key Features of submit():
        Accepts Callable or Runnable:
        submit() accepts either a Callable or a Runnable task.
        Return Future Object:
        Unlike execute(), which doesn't return a result, submit() returns a Future object that can be used to:
        Retrieve the result of the computation.
        Check the task's completion status.
        Cancel the task if needed.

        see the difference between callable and runnable from chat GPT

        */

        ExecutorService executorService = Executors.newFixedThreadPool(2);

        // Runnable task
        Runnable runnableTask = () -> {
            System.out.println(Thread.currentThread().getName() + ": Runnable is running");
        };

        // Callable task
        Callable<String> callableTask = () -> {
            System.out.println(Thread.currentThread().getName() + ": Callable is running");
            return "Result from Callable";
        };

        // Submit Runnable
        Future<?> runnableFuture = executorService.submit(runnableTask);
        // Submit Callable
        Future<String> callableFuture = executorService.submit(callableTask);

        try {
            // Get the result of the Callable
            String result = callableFuture.get();
            System.out.println("Callable result: " + result);

            // Runnable result is null since it does not return a value
            System.out.println("Runnable result: " + runnableFuture.get());
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        } finally {
            executorService.shutdown();
        }

    }
}
