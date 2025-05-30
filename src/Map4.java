import java.util.*;
public class Map4 {
    public static void main(String[] args) {
        String str="prograaming is a fun and fun is a prograaming";
     //   char[] ch  = str.toCharArray();
        String [] word=str.split(" ");
        HashMap<String,Integer> map=new HashMap<>();
      //  for (char i :ch){
      //  map.put(i, map.getOrDefault(i,0)+1);
        for (String words :word){
            map.put(words, map.getOrDefault( words,0)+1);
        }
        System.out.println(map);
    }
}
