import java.util.*;
public class rev {
    public static void main(String[] args) {
        String s = "my name is isha";
        String[] words = s.split(" ");
//        for(int i =0;i<words.length;i++){
//            char[] chars = words[i].toCharArray();
//            int left = 0, right = chars.length-1;
//            while (left < right){
//
//            }
        // }
//      for(String word:words){
//          String temp = "";
//          for (int i =word.length()-1;i>=0;i--){
//              temp = temp + word.charAt(i);
//          }
//          System.out.println(temp);
//      }
//        System.out.println();

        for (int i = 0; i < words.length; i++) {
            //    String reverse = " ";
          //  for (int j = words[i].length() - 1; j <= 0; j--) {
                //   reverse += words[i].charAt(j);
//                if (i == 0) {
            if(words[i].length()>0){
                    words[i] = words[i].substring(0,1).toUpperCase()+words[i].substring(1);
                }
            }
        String result = String.join(" ", words);
        System.out.println(result);

    }
    }

