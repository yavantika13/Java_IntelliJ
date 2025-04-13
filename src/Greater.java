import java.util.Scanner;
public class Greater
{
    public static void main(String[] args) {
     Scanner in = new Scanner(System.in);
     System.out.println("enter a value of a");
     int a= in.nextInt();
     System.out.println("enter a value of b");
     int b= in.nextInt();
     if(a<b){
         System.out.println(" b is greater");

     }
     else  {
         System.out.println("a is greater");
     }
    }
}
