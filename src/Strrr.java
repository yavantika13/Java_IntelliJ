public class Strrr
{
    public static void main(String[] args) {
        String str="aaabbbbccc";
        StringBuilder newStr=new StringBuilder();
        int count=1;
        for (int i=1;i<str.length();i++){
            if (str.charAt(i)==str.charAt(i-1)){
                count++;
            }
            else{
                newStr.append(str.charAt(i-1)).append(count);
                count=1;
            }
        }
        System.out.println(count);
    }
}
