/*
start method creates a new thread and then invokes the run method on that new thread whereas run directly calls the run method on main thread
on using start a new thread is created in the JVM ,whereas in run no new thread is created,it directly executes in main thread
enables concurrent execution of run method,whereas no concurrency in another
you cannot call the start() method twice it will give an Exception saying that the thread has already started
*/

/*
Key Points:
Use start(): Always use start() to actually create and execute a thread.
Avoid Directly Calling run(): Calling run() directly does not create a new thread, defeating the purpose of using threads.
Thread Identification: The thread name (Thread.currentThread().getName()) helps you identify which thread is executing the run() method.
By using start(), you leverage Java's multithreading capabilities, allowing for concurrent execution of tasks.
*/
class Thread0 extends Thread{

    public void run(){
        System.out.println("Run method executed by " + Thread.currentThread().getName());
    }
}

public class Start_Vs_Run {
    public static void main(String[] args) {
        Thread thread=new Thread0();
        System.out.println("Calling run() directly:");
        thread.run(); // Executes on the main thread

        System.out.println("\nCalling start():");
        thread.start(); // Executes on a separate thread
    }
}
