import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Executor2_9 {
    public static void main(String[] args) {
        //we're gonna see scheduled Executor Service
        ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(2);

        // Schedule a task to run after a delay
        scheduler.schedule(() -> {
            System.out.println("Task executed after 3 seconds delay");
        }, 3, TimeUnit.SECONDS);

        // Schedule a periodic task
        scheduler.scheduleAtFixedRate(() -> {
            System.out.println("Periodic Task executed at " + System.currentTimeMillis());
        }, 1, 2, TimeUnit.SECONDS);

        // Stop the scheduler after 10 seconds
        scheduler.schedule(() -> scheduler.shutdown(), 10, TimeUnit.SECONDS);
    }
}
