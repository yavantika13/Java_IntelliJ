public class Ls {

    static int LinearSearch(int[] arr, int targetValue) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == targetValue) {
                return 1;
            } else {
                return -1;
            }
        }
        return targetValue;
    }
    
    public static void main(String[] args) {
        int[] arr = {1, 2, 5, 10, 4};
        int targetValue = 5;
        LinearSearch(arr, targetValue);
    }
}