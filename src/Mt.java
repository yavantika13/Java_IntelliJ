class MyRunnable implements Runnable{
   public void run(){
       System.out.println("Thread using Runnable interface");
   }
}
public class Mt {
    public static void main(String[] args) {
        MyRunnable obj= new MyRunnable();
        Thread t1 = new Thread(obj);
        t1.start();
        System.out.println("main Thread is running");
    }
}
