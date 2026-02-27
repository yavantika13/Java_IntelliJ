public class math {
    public static void main(String[] args) {
        System.out.println(Math.random());
        System.out.println(Math.sqrt(25));
        System.out.println(Math.pow(2, 3));
        System.out.println(Math.max(25, 15));
        System.out.println(Math.min(25, 15));


        int n1 = 123;
        String[] words = {"Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};
//        while (n != 1){
//            int sum = 0;

        while (n1 > 0) {
            int digit = n1 % 10;
            System.out.println(words[digit] + " ");
            n1 = n1/10;
        }

        int n2=145;
        int digit = 0,sum=0;
        while (n2>0){
            int fact = 1;
            digit= n2%10;
            for(int i =2;i<=digit;i++){
                fact =fact*i;
            }
             sum += fact;
            n2 = n2/10;
            System.out.println(fact);
        }
       System.out.println(sum);
        if (n2 == sum) {
            System.out.println( sum + " is a Strong Number");
        } else {
            System.out.println(sum + " is Not a Strong Number");
        }

    }
}

