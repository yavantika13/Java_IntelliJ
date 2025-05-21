public class AllEven
{
    public static void Even(int a, int b){
        for(int i=a;i<=b;i++){
            int num=i;
            if (num%2==0){
                System.out.println(num);
            }
        }
    }

    public static void main(String[] args) {
        Even(4,6);
    }
}
