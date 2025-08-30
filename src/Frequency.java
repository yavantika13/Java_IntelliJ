import java.util.*;
public class Frequency {
    public static void main(String[] args) {
        String str1="h e l l o";
        String str2="o l l h e";
        String [] newstr=str1.split(" ");
        String [] newstr1= str2.split(" ");
        HashMap<String,Integer> map=new HashMap<>();
        for (String str:newstr){
            map.put(str,map.getOrDefault(str, 0)+1);

        }
        System.out.println(map);
    }
}
// 1 2 3
// 4 5 6
// 7 8 9      123698745