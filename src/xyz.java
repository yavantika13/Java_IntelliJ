public class xyz {
    public static void main(String[] args) {
        for (int i=1; i<=5; i++) {
            for (int j = 1; j <= i; j++) {


                System.out.print(" ");
            }
            for (int k=i; k >= i; k--) {
                System.out.print("*");
            }
            for (int p=i; p>i; p--) {
                System.out.print("*");


            }
            System.out.println();
        }

    }
}
