import java.util.Arrays;
public class Arrays1 {
    public static void main(String[] args) {
        int[] arr = {1, 0, 2, 0, 4, 0, 5};
        int index = 0 ;
        for (int i =0; i< arr.length;i++){
            if(arr[i] !=0){
                arr[index] = arr[i];
                index++;
            }
        }
        while (index < arr.length){
            arr[index]=0;
            index++;
//            System.out.println(Array_1.toString(arr));
        }
        System.out.println(Arrays.toString(arr));
    }
}
