import java.util.Scanner;
public class  Input
{
    public static void main(String[] args) {
     Scanner in= new Scanner(System.in);
     System.out.println("Enter size of arr");
     int n=in.nextInt();
     int [] arr=new int[n];
     System.out.println("Enter value of arr");
     for(int i=0;i<n;i++){
         arr[i]=in.nextInt();

     }
     for(int k=0;k<arr.length;k++){
         System.out.println(arr[k]);
     }
    }

}
