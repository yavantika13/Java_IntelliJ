public class Strr2
{
    public static void main(String[] args) {
        String str="hhlloo";
        String newStr="";
        for (int i=0;i<str.length();i++){
            char c=str.charAt(i);
            if (newStr.indexOf(c)==-1){
                newStr=newStr+c;

            }
        }
        System.out.println(newStr + "  ");
    }
}
