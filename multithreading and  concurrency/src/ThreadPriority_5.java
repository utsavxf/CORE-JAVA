class PriorityThread extends Thread {
    public PriorityThread(String name) {
        super(name); // Set the thread name
    }

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(Thread.currentThread().getName() + " is running. Priority: " + Thread.currentThread().getPriority() + " Count: " + i);
            try {
                Thread.sleep(100); // Sleep for 100ms to simulate some work
            } catch (InterruptedException e) {
                System.out.println(Thread.currentThread().getName() + " interrupted.");
            }
        }
    }
}


public class ThreadPriority_5 {
    public static void main(String[] args) {
        System.out.println("Main thread starting.");

        // Create threads
        PriorityThread t1 = new PriorityThread("Thread-1 (Min Priority)");
        PriorityThread t2 = new PriorityThread("Thread-2 (Max Priority)");
        PriorityThread t3 = new PriorityThread("Thread-3 (Normal Priority)");

        // Set priorities
        t1.setPriority(Thread.MIN_PRIORITY); // Priority 1
        t2.setPriority(Thread.MAX_PRIORITY); // Priority 10
        t3.setPriority(Thread.NORM_PRIORITY); // Priority 5 (default)

        // Start threads
        t1.start();
        t2.start();
        t3.start();

        System.out.println("Main thread exiting.");
    }
}
