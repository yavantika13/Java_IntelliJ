public class Array2 {
    public static void main(String[] args) {
        int [] arr = {1, 2,3,4,6};
        int target = 10;
        int sum =0;
        for(int i=0;i<arr.length; i++){
            for(int j=i+1;j<arr.length;j++){
            sum = arr[i] + arr[j];
            }
        }
        if(sum == target)
            System.out.println("yes");
        else
            System.out.println("No");
    }
}
