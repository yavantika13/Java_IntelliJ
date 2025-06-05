import java.lang.Exception;

class MyRunnables implements Runnable {
    public void run() {
        System.out.println("THread using Runnable interface");
    }
}
public class Mt1 {
    public static void main(String[] args) {
        MyRunnables obj = new MyRunnables();
        Thread t1 = new Thread(obj);
        t1.start();
        try {
            t1.join();
        } catch (Exception e){
           // e.setStackTrace();
        }
        //for ()
    }
}
