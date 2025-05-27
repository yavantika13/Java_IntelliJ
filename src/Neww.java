import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Neww
{
    public static void main(String[] args) {
        ArrayList<String> arr= new ArrayList<>();
    //   ArrayList<Integer> arr= new ArrayList<int>();
        arr.add("23");
        arr.add("12");
        arr.add("13");
       arr.add(0,"23");
      //  Collections.sort(arr);
        System.out.println(arr);
        System.out.println(arr.get(1));
        System.out.println(arr.remove(0));
       // System.out.println(arr.set());
    }
}
