import java.util.Scanner;
public class Exception {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("enter a value of a");
        int a=in.nextInt();
        System.out.println("enter a value of b");
        int b=in.nextInt();
        try {
            int c=a/b;
            System.out.println(c);
        } catch (java.lang.Exception e) {
            System.out.println("we can not divide");
        }
        System.out.println("hello");
        System.out.println("hii");
        System.out.println("byee");
    }
}
