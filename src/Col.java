//import java.util.ArrayList;
import java.util.LinkedList;
public class Col {
    public static void main(String[] args) {
        LinkedList<Integer> arr = new LinkedList<>();
        long start = System.nanoTime();
        arr.add(5);
        System.out.println(arr.contains(5));
        long end = System.nanoTime();
        System.out.println(end - start);
    }
          }
