import java.lang.Exception;

class Mythread extends Thread{
    public void run(){
        System.out.println("hello");
        try {
            Thread.sleep(2000);
        } catch (Exception e){
            System.out.println("hii");
        }
      //  System.out.println("hii");
    }
}
public class Multi {
    public static void main(String[] args) {
      MyThread t1= new MyThread();
      t1.start();
      //  System.out.println("hi");
    }
}
