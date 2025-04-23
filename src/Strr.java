public class Strr {
    public static void main(String[] args) {
        String str = "hello";
        String str1 = "hiiii";

        int count = 0;
     if(str.length()!=str1.length()){
         System.out.println("string are not same");
         return;
     }
     for(int i=0;i<str1.length();i++){
         if(str.charAt(i)!=str1.charAt(0)){
             System.out.println("string are not equal");
             return;
         }
     }
     System.out.println("string are equal");
    }
}
     /*   String palindrome = "racecaer";
        char[] arr = palindrome.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}*/