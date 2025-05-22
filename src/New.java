import java.lang.Exception;

public class New {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        try {
            int c = a / b;
            System.out.println(c);
        } catch (Exception e) {
            System.out.println("we can not divide by zero");
        }
        System.out.println("hello");
        System.out.println("hii");
        System.out.println("byee");
    }


}
