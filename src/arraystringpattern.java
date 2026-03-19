public class arraystringpattern {
    public static void main(String[] args) {
        int arr[] = {2, 4, 6, 8, 10};
        int prefix[] = new int[arr.length];
        prefix[0] = arr[0];
        for(int i = 1; i< arr.length; i++)
        {
            prefix[i] = arr[i] + prefix[i-1];
        }
        for(int j = 0; j< arr.length; j++)
        {
            System.out.println(prefix[j]+" ");
        }
        //Two pointer
        int arr1[] = {1, 2, 3, 4, 5, 6};
        int target = 7;
        int left = 0;
        int right = arr1.length-1;
        while (left<right){
            int sum = arr1[left]+arr1[right];
            if(sum == target)
            {
                System.out.println(arr1[left] + " " +arr1[right]);
                break;
            }
            else if (sum>target){
                right--;
            }
            else {
                left++;
            }
        }

        // Sliding Window
        int arr2[] = {2, 1, 2, 5, 1, 3, 2};
        int k =3;
        int windowsum = 0;
        for(int i = 0; i < k; i++){
            windowsum += arr2[i];
        }
        int maxsum = windowsum;
        for(int j = k; j< arr2.length; j++){
            windowsum += arr2[j];
            windowsum -= arr2[j-k];
            maxsum = Math.max(maxsum,windowsum);
        }
        System.out.println(maxsum);
    }
}
