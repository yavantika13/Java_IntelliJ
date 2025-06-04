class MyThread extends Thread{
    public void run() {
        System.out.println("hello");
    }
}
public class MultiT {
    public static void main(String[] args) {
        MyThread t1= new MyThread();
        t1.start();
        System.out.println("hiii");

    }
}
