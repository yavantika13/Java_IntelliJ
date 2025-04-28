public class Method
{
    static void sum(int a) {

        int sum = 0;
        while (a != 0) {
            sum = sum + (a % 10);
            a = a / 10;
        }
        System.out.println(sum);
    }
        public static void main(String[] args){
            sum(123);
        }



    }

