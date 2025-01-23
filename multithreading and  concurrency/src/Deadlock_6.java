public class Deadlock_6 {
    public static void main(String[] args) {
        //Let's create a deadlock in Java
        String lock1="a";
        String lock2="b";
        Thread thread1=new Thread(()->{
            synchronized (lock1){
                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                synchronized (lock2){
                    System.out.println("lock acquired");
                }
            }
        },"thread1");

        //easy just reverse the order
        Thread thread2=new Thread(()->{
            synchronized (lock2){
                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                synchronized (lock1){
                    System.out.println("lock acquired");
                }
            }
        },"thread2");
        thread1.start();
        thread2.start();

    }
}
