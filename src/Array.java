public class Array {
    public static void main(String[] args) {
        int[][] matrix ={{1,2},{3,4}};
        for (int i=0;i<matrix.length;i++){
            for(int j=0;j< matrix.length;j++){
                System.out.println(matrix[i][j]+" ");
            }
        }

        int [][] A= {{1,2},{3,4}};
        int [][] B= {{5,6},{7,8}};
        int row = A.length;
        int col = B[0].length;
        int [][] result = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                for (int k = 0; k < B.length; k++) {
                    result[i][j] += A[i][k] * B[k][j];
                }
            }
        }
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
          }
        }
}
