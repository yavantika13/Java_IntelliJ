// WRITE A PROGRAM TAKE AN ARRAY AS INPUT FROM USER AND MOVE ALL THE ZEROS OF
// THE ARRAY TO THE
// RIGHT SIDE OF THE ARRAY
public class zero {
    public static void main(String[] args) {
        int[] arr = { 1, 0, 2, 0, 3, 0, 4, 0, 5, 0 };
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[count] = arr[i];
                count++;
            }
        }
        while (count < arr.length) {
            arr[count] = 0;
            count++;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
// WRITE A PROGRAM WHICH WILL SHIFT EVEN AND NEGATIVE NUMBER TO THE LEFT SIDE OF THE ARRAY
// MERGE TWO SORTED ARRAY TO CREATE NEW SORTED ARRAY
