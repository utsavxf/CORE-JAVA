

class Stack{
    Object lock;
    private int[] array;
    private int stackTop;
    public Stack(int capacity){
        array=new int[capacity];
        stackTop=-1;
        lock=new Object();
    }
    public boolean isEmpty(){
        return stackTop<0;
    }
    public boolean isFull(){
        return stackTop>=array.length-1;
    }
    public boolean push(int element){
        synchronized(lock){ //here we can use any object as a lock,you don't have to worry about that
            if(isFull())return false;
            ++stackTop;
            try{
                Thread.sleep(1000);
            }catch(Exception e){

            }
            array[stackTop]=element;
            return true;
        }
    }

    public int pop(){
        synchronized(lock) {
            if(isEmpty())return Integer.MIN_VALUE;
            int obj=array[stackTop];
            array[stackTop]=Integer.MIN_VALUE;
            try{
                Thread.sleep(1000);
            }catch(Exception e){

            }
            stackTop--;
            return obj;
        }

    }


}

public class Synchronization_2 {
    public static void main(String[] args) {
      System.out.println("main is starting");
      Stack stack=new Stack(5);
      //starting new threads via lambda functions
      new Thread(()->{
          int counter=0;
          while(++counter<10)
              System.out.println("Pushed: "+ stack.push(100));
      },"Pusher").start();

        new Thread(()->{
            int counter=0;
            while(++counter<10)
                System.out.println("Popped: "+ stack.pop());
        },"Popper").start();
        System.out.println("main is exiting");

        //WE WILL GET ARRAY INDEX OUT OF BOUNDS EXCEPTION
        //WE HAVE TO ENSURE THAT THE METHODS WHICH ARE CHANGING THE STATE OF SOME OBJECT (push,pop) here needs to be synchronized
        //rest theory see from video


    }
}
