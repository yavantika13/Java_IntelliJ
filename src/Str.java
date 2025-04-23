public class Str {
    public static void main(String[] args) {
        String str = "racecar";
        //  System.out.println(str);
        //  System.out.println(str.charAt(2));
        //  System.out.println(str.length());
        //    for(int i=0; i<str.length();i++)
        //  for(int i=str.length()-1;i>=0;i--){
        //    System.out.println(str.charAt(i));
        int i = 0, j = str.length() - 1;
        while (i < j) {
            if (str.charAt(i) != str.charAt(j)) {
                System.out.println("Not Palindrome");
                break;
            } else {
                i++;
                j--;
                System.out.println("Palindrome");


            }
        }

    }
}