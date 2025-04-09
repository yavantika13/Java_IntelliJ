public class Sum
{
    public static void main(String[] args) {
        int Num=1234,sum=0;
        while(Num!=0)
        {
            sum=sum+(Num%10);
            Num=Num/10;
        }
                System.out.println(sum);
    }
}
