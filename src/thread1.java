import java.lang.Exception;

class Filedownload extends Thread  {
    String fileName;
    public Filedownload(String fileName){
        this.fileName=fileName;
    }
    public static void file(String fileName) {
        for (int i = 1; i <= 5; i++) {
            System.out.println(fileName + "downloading..." + (i * 20) + "%");
            try{
                Thread.sleep(2000);
            } catch (Exception e){

            }
        }
        System.out.println(fileName + "doneee");
        System.out.println("  ");
    }
}

public class thread1 {
    public static void main(String[] args) {
//downloadFile obj =new downloadFile();
        Filedownload t1=new Filedownload("file A");
        Filedownload t2=new Filedownload("file B");
        t1.start();
        t2.start();
    }
}

