import java.util.*;
public class Map {
    public static void main(String[] args) {
        HashMap<String,Integer> map=new HashMap<>();
        map.put("id0",1);
        map.put("id1",2);
        map.put("id2",3);
        System.out.println(map.get("id0"));
        System.out.println(map.containsKey("id0"));
        System.out.println(map.containsValue(2));
        System.out.println( map.remove("id0"));
    }
}
