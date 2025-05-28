import java.util.*;
public class Set2 {
    public static void main(String[] args) {
        int[] ar={1,2,2,42,4,5,3,53,45,3,5};
        TreeSet<Integer> set=new TreeSet<>();
        for (int i:ar){
            if(set.contains(i)){
                System.out.println(i);
                break;
            }
            set.add(i);

        }
        System.out.println(set);
    }
}



