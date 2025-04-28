public class M1
{
    static int sum(int a,int b){
        return a+b;
    }

    public static void main(String[] args) {
        int output=sum(5,10);
        System.out.println(output);
    }
}
/*
static int sum(int a, int b) {
        //  return a+b;
        int c = a + b;
        int count = 0;

        return c;


        while (c > 0) {
            int digit = c % 10;
            if (digit >= count) {
                c = c / 10;
            }
        }
        System.out.println(count);
        count++;
        return c;
 */