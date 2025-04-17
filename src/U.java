import java.util.Scanner;
public class U {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.println("Enter size of arr");
        int n=in.nextInt();
        int [] arr=new int[n];
        System.out.println("Enter value of arr");
           for(int i=0;i<n;i++){
        //   for(int i=n-1;i>=0;i--){
            arr[i]=in.nextInt();
        }
        //for(int k=0;k<arr.length;k++){
          for(int k=n-1;k>=0;k--){
            System.out.println(arr[k]);
        }
    }

}

