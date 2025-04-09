public class String_Demo
{
    public static void main(String[] args) {
        String str  = "malayalam";
       // System.out.println(str.charAt(4));
       // System.out.println(str);
       // System.out.println(str.toUpperCase());
       // System.out.println(str.toLowerCase());
      //  System.out.println(str.length());
      //  System.out.println(str.charAt(7));
      //  System.out.println(str.trim().charAt(7));
        int i=0,j=str.length()-1;
        while (i<j){
            if (str.charAt(i) !=str.charAt(j)){
                System.out.println("Not Palindrome");
                break;
            }
            else {
                i++;
                j--;
                System.out.println("Palindrome");

            }
        }
    }
}
