import java.util.*;
public class Map1 {
    public static void main(String[] args) {
        HashMap<String,Integer> map=new HashMap<>();
        map.put("id0",1);
        map.put("id1",2);
        map.put("id2",3);
        for (String key:map.keySet()){
            System.out.println(key);
        }
    }
}
