class MyTh extends Thread {
    public void run(){
        for (int i=1; i<=10;i++){
            System.out.println(getName() + "is running with priority" );
            Thread.yield();
        }
    }

}
public class Mt5 {
    public static void main(String[] args) {
        MyTh t1= new MyTh();
        MyTh t2= new MyTh();
        t1.setName("low priority thread");
        t2.setName("high priority thread");

        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.MAX_PRIORITY);

        t1.start();
        t2.start();
    }
}
