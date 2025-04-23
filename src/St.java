public class St
{
    public static void main(String[] args) {
        String str="racecar";
        String target ="r";
        int count=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==target.charAt(0)){
                count++;
            }
        }
        System.out.println(count);

    }
}
