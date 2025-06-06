public class Mt4 {
    public static void main(String[] args) {
        System.out.println("idher dekho");
        Thread t1= new Thread( ()->{
            System.out.println("hello");
            try{
                Thread.sleep(2000);
            } catch (InterruptedException e) {
              //  throw new RuntimeException(e);
            }
            System.out.println("hum last m aayenge");
        });
        Thread t2= new Thread( ()->{
            System.out.println("hii");
        });
          t1.start();
          t2.start();
    }
}
