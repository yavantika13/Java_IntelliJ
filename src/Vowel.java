import java.util.Scanner;
public class Vowel {
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("enter the char");
    char a =  in.next().charAt(0);
    switch (a) {
        case 'a':
        case 'e':
        case 'i':
        case 'o':
        case 'u':
         System.out.println("vowel");
         break;
        default:
            System.out.println("consonant");
    }
    }
}
