import java.util.Scanner;
public class Array {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.println("enter a size");
        int n =in.nextInt();
        int[] arr= new int[n];
        System.out.println("enter a element");
        for(int i=1;i<n;i++){
            arr[i]=in.nextInt();
        }
        int max=arr[0];
        for (int i=1;i<n;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println("maximum element:"+ max);

    }
}
