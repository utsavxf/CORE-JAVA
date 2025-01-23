import java.util.LinkedList;
import java.util.Queue;
class BlockingQueue{
    private Queue<Integer>q;
    private int capacity;
    public BlockingQueue(int cap){
        q=new LinkedList<>();
        capacity=cap;
    }
    public boolean add(int item){
        synchronized (q){
           while(q.size()==capacity){
               try{
                   q.wait();
               }catch(InterruptedException e){
                   e.printStackTrace();
               }
           }

           q.add(item);
           q.notifyAll();
           return true;

        }
    }

    public int remove() {
         synchronized (q){
             while(q.size()==0){
                 //this thread has to wait till any other adder thread adds a particular item to the thread
               try{
                   q.wait();
               }catch(InterruptedException e){
                   e.printStackTrace();
               }
             }


            int element=q.poll();
             q.notifyAll();
            return element;
         }
    }



}


public class ProducerConsumer_3 {

}
