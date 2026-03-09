import java.util.*;
public class Arrayss {
    public static void main(String[] args){
        int[] arr ={3,5,7,8,12,15};
        int target = 19;
        for(int i =0;i<arr.length;i++){
            for(int j = i+1;j<arr.length-1;j++){
                if(target == arr[i]+arr[j])
                    System.out.println("Yes");
                else
                    System.out.println("No");
            }
        }
    }
}
