public class Array2
{
    public static void main(String[] args) {
    int[] [] arr={ {1,2,3,4},{1,2,3,4}};
    int totalCount=0;
    for (int i=0;i<arr.length;i++){
        totalCount=totalCount+arr[i].length;
     //   for (int j=0;j<arr[i].length;j++){
          //  System.out.println(arr[i][j]);
        // totalCount++;
        }
        System.out.println(totalCount);
  //  }
    }
    }