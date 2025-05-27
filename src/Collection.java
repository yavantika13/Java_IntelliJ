import java.util.ArrayList;
import java.util.Collections;

public class Collection
{
    public static void main(String[] args) {
        ArrayList<String> arr= new ArrayList<>();

        arr.add("a");
        arr.add("B");
        arr.add("c");
        Collections.sort(arr);
        System.out.println(arr);

    }
}
