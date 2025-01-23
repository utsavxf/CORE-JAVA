
//CREATING A THREAD BY EXTENDING THREAD CLASS
class Thread1 extends Thread{

    public Thread1(String threadName){
        super(threadName);
    }
    public void run(){
       for(int i=0;i<5;i++){
//           System.out.println("inside thread1 "+ Thread.currentThread().getName()+" "+i);
           System.out.println("inside thread1 "+ Thread.currentThread()+" "+i);
       }
   }
}

//CREATING A CLASS BY EXTENDING RUNNABLE INTERFACE
//runnable interface is a functional interface (interface which have only 1 abstract method,can contain any number of default or static methods ,these interfaces generally forms the basis of lambda expressions about which you will study later)
//thus it needs to override the run() method in the runnable interface
class Thread2 implements  Runnable{
    @Override
    public void run() {
        for(int i=0;i<5;i++){
            System.out.println(Thread.currentThread()+ ", "+i);
        }
    }
}
public class CreatingThread_1 {
    public static void main(String[] args) {
//       System.out.println("main is starting");
//       Thread thread1=new Thread1();
//       thread1.start(); //this method does not immediately start ,it just tells the JVM that hello JVM I am ready to start whenever you are ready and in turn JVM will call the run() method in some time
//       //thread1 will be child process of main thread
//       System.out.println("main is exiting");

        //WHY THE OUTPUT SEEMS OUT OF ORDER
        //Since thread1 runs concurrently with the main thread, their outputs are not synchronized. Both threads can print to the console at overlapping times.
        //THE ORDER IS PURELY DECIDED BY JVM AND IT IS PLATFORM DEPENDENT
        //BUT WHAT IF I WROTE thread1.run() inside of start, then? read the article between start vs run and then you'll know
        //ALSO WE CAN SEE THAT MAIN THREAD EXITED BUT STILL THE PROGRAM DIDN'T STOP THAT'S BECAUSE THE JVM WILL CONTINUE RUNNING THE THREADS TILL THERE ARE USER THREADS REMAINING
        //IF DAEMON THREADS ARE RUNNING BUT NO USER THREAD THEN PROGRAM IS AT THE MERCY OF JVM WHETHER TO RUN OR NOT IN MOST CASES IT DOES NOT AND TERMINATES

//        System.out.println("main is starting");
//        Thread thread1=new Thread1("thread1");
//        thread1.setDaemon(true); //it's no longer a user thread but a daemon thread which will run in the background
//        thread1.start(); //this method does not immediately start ,it just tells the JVM that hello JVM I am ready to start whenever you are ready
//        //thread1 will be child process of main thread
//        System.out.println("main is exiting");
        //YOU CAN CLEARLY SEE FROM THE OUTPUT THAT THE PROGRAM TERMINATED AFTER MAIN THREAD EXITS

        //CREATING THREAD VIA RUNNABLE INTERFACE
        Thread2 bullet=new Thread2(); //we have to pass this object inside thread
        Thread thread2=new Thread(bullet,"thread2");
//      Thread thread2=new Thread(new Thread2(),"thread2");

        /*

        The Thread class itself also implements runnable and it has an object named target inside of it
        so what we do in either we extend Thread class and override the run method according to our own implementation or we provide object of runnable interface so that target will be set to that

        NOW COMES THE QUESTION THAT WHICH METHOD I SHOULD USE
        if I choose to extend Thread class,I cannot extend any other class as in Java we cannot extend multiple classes
        that's why it's preferred to use Runnable interface way
        */

        //LAMBDA FUNCTION IMPLEMENTATION
        //basically what we do is we pass the implementation of the run method as a parameter

        Thread thread3 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                System.out.println(Thread.currentThread() + ", " + i);
            }
        }, "thread3");

        thread3.start(); // Start the thread

    }
}
