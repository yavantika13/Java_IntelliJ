import java.util.*;
public class Set1 {
    public static void main(String[] args) {
        //int[] ar={1,2,2,42,4,5,3,53,45,3,5};
        TreeSet<String> set=new TreeSet<>();
      //  HashSet<String> set=new HashSet<>();
        set.add("1");
        set.add("2");
        set.add("2");
        set.add("42");
        set.add("4");
        set.add("5");
        set.add("3");
        set.add("53");
        set.add("45");
        set.add("3");
        set.add("5");
      //  System.out.println(set.contains());
        System.out.println(set);
    }
}
