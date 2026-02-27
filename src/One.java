public class One {
    public static void main(String[] args) {
        int age = 18;
        if(age>18)
            System.out.println("True");
        else
            System.out.println("False");

        for(int i=0;i<5;i++){
            System.out.println(i);
        }

        int[] arr={10, 20, 30, 40, 50};
        System.out.println(arr[0]);
        int sum=0;
        for(int i= 0;i<arr.length;i++){
            sum = sum+arr[i];
        }
        System.out.println(sum);

//        int[] arr1={10, 20, 30, 40, 50};
//        int y = 10;
//        for(int i= 0;i<arr.length;i++){
//            if(arr1[i]== y) {
//                System.out.println("True");
//            }
//
//        }
//        int[] arr1={10, 20, 30, 40, 50};
//        int y = 10;
//        boolean found = false;
//       for(int i= 0;i<arr.length;i++){
//           if(arr1[i]==y){
//               found = true;
//           }
//       }
//        System.out.println(found);

    int [] arr1={10,20,30,40,50};
//    int sorted = 0;
    boolean found = true;
        for(int i= 0;i<arr.length-1;i++) {
      if(arr1[i]>arr1[i+1]){
          found = false;
      }
        }
        if(found) System.out.println("Sorted");
        else System.out.println("Not sorted");

        int[] arr2 = {10, -20, 30, -40, 50};

        int positiveCount = 0;
        int negativeCount = 0;

        for (int num : arr2) {
            if (num > 0) {
                positiveCount++;
            } else if (num < 0) {
                negativeCount++;

            }
        }

        System.out.println("Positive count: " + positiveCount);
        System.out.println("Negative count: " + negativeCount);

        int [] arr3 ={1,2,3,5,6};
                int n=6;
                int expectedsum = n * (n+1) / 2;
                int actualsum = 0;
        for (int num : arr3) {
            actualsum += num;
        }
        int missing = expectedsum - actualsum;
        System.out.println("Missing number: " + missing);
        int [] arr4={10,20,30,40,50};
        int first = arr4[0];
        for(int i=0;i<arr4.length-1;i++)
        {
            arr4[i]=arr4[i+1];
        }
        arr4[arr4.length-1]=first;
        for (int i=0;i<arr4.length;i++)
        {
            System.out.println(arr4[i]+" ");
        }

        int[] arr5 = {1, 2, 3, 2, 4, 5, 1, 6};
        System.out.println("Duplicate elements:");
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr5[i] == arr5[j]) {
                    System.out.println(arr5[i]);
                }
            }
        }

    }
}

