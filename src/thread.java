import java.lang.Exception;

class downloadFile {
    public static void file(String file) {
        for (int i = 1; i <= 5; i++) {
            System.out.println(file + "downloading..." + (i * 20) + "%");

            try{
                Thread.sleep(2000);
            } catch(Exception e){

            }
        }
        System.out.println(file + "done");
        System.out.println("  ");
    }
}

public class thread {
    public static void main(String[] args) {
        downloadFile obj =new downloadFile();
        obj.file("file A");
        obj.file("file B");
    }
}


