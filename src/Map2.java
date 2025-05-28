import java.util.*;
public class Map2 {
    public static void main(String[] args) {
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(1,1);
        map.put(2,2);
        map.put(3,5);
       map.forEach((key,value) ->{
            System.out.println(key + " "+ value);
        });
    }
}
