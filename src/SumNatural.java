import java.util.Scanner;

public class SumNatural
{
    public static int Sum(int n){
        int sum=0;
        for(int i=1;i<=n;i++){
            sum+=i;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner Scanner=new Scanner(System.in);
        System.out.println("Enter a positive integer number");
        int n=Scanner.nextInt();
        if (n>0){
            int result=Sum(n);
            System.out.println("sum of first" + n +"");
        }
    }
}
