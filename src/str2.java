public class str2 {
    public static void main(String[] args) {
        String str = "hellloo";
        String newStr = "";
        char[] ch=str.toCharArray();
        for (int i = 0; i < ch.length; i++) {
          for(int j=i+1;j<ch.length;j++){
              if (ch[i]==ch[j]){
                  System.out.println(ch[i]);
                  return;

              }
          }

        }
    }
}