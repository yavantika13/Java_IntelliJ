import  java.util.*;
//public class Vowels {
//    public static void main(String[] args) {
//        String s = "hello";
//        for (int i = 0;i<s.length();i++) {
//            char ch = Character.toLowerCase(s.charAt(i));
//            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') ;
//            {
//            System.out.println(ch + " is a Vowel");
//        }
//            else if (ch >= 'a' && ch <= 'z'){
//                System.out.println(ch + "is a Consonant");
//            }
//            else
//            {
//                System.out.println(ch + " is not an alphabet character");
//
//            }
//        }
//    }
//}
public class Vowels {
    public static void main(String[] args) {
        String s = "hello"; // fixed string

        for (int i = 0; i < s.length(); i++) {
            char ch = Character.toLowerCase(s.charAt(i));

            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                System.out.println(ch + " is a vowel");
            }
            else if (ch >= 'a' && ch <= 'z') {
                System.out.println(ch + " is a consonant");
            }
            else {
                System.out.println(ch + " is not an alphabet character");
            }
        }
        String freq = "banana";
        HashMap<Character, Integer> map = new HashMap<>();
        for(char ch : freq.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        System.out.println(map);


        String s1 = "silent";
        String s2 = "listen";
        char[] arr1 = s1.toCharArray();
        char[] arr2 = s2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        if (Arrays.equals(arr1, arr2)) {
            System.out.println("Anagram");
        } else {
            System.out.println("Not an anagram");
        }
        String s3 = "hello hii";
        s3 = s3.replaceAll("\\s", "");
        System.out.println(s3);
    }
}
