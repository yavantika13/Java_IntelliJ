import java.util.Scanner;
public class Any
{
    public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      System.out.println("enter a value of a");
      int a= in.nextInt();
      if(a==0){
          System.out.println("zero");

      }
      else if (a<0) {
          System.out.println("negative");
      }
      else {
          System.out.println("positive");
      }
    }
}
