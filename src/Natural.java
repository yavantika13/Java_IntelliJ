import java.util.Scanner;
public class Natural
{
    public static void Natural(int n){
        for (int i=1;i<=n;i++){
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        Scanner Scanner= new Scanner(System.in);
        System.out.println("Enter a number");
        int n=Scanner.nextInt();
       Natural(n);
       Scanner.close();

    }
}
