//public class If

interface Cleint1{
    void show();
}
interface Cleint2 {
    void show();

    void print();
}
class I implements Cleint1,Cleint2{

    public void show() {
        System.out.println("for both");
    }


    public void print() {
        System.out.println("for ");

    }
}
public class If{
    public static void main(String[] args) {
        I obj=new I();
        obj.print();
        obj.show();
    }
}