import java.util.*;
public class Stringgg {
    public static void main(String[] args) {
        String s = "Hello World";
        System.out.println(s);
        System.out.println(s.length());
        System.out.println(s.charAt(1));
        System.out.println(s.substring(0,4));
        System.out.println(s.toLowerCase());
        System.out.println(s.toUpperCase());
        System.out.println(s.contains("World"));
        System.out.println(s.replace('l','x'));

        String s1 = "Java easy to learn";
        String[] words = s1.split(" ");
        for(String word :words ) {
            System.out.println(word);
        }
        String s2 = "hello";
        for(int i = s2.length()-1;i>=0;i--){
            System.out.print(s2.charAt(i));
        }
        String s3 = "madam";
        String rev = "";
        for(int i = s3.length()-1;i>=0;i--){
            System.out.print(s3.charAt(i));
            rev = rev + s3.charAt(i);
        }
        System.out.println(rev);
        if(s3.equals(rev)){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not Palindrome");
        }
    }
}
