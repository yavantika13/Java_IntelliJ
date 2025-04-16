public class No
{
    public static void main(String[] args) {
        int a=123;
     //   int original =a;
     //   int res =0;
        int sum=0;
        while (a>0){
            //int digit =a%10;
            sum=sum+a%10;
     // res = res*10+digit;
            a=a/10;


        }
        System.out.println(sum);
        //if(a == res){
        //    System.out.println("Yes, it is a palindrome!");
        //} else {
        //    System.out.println("No, it is not a palindrom");
        //}
    }
}
