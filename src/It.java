import java.util.*;
public class It {
    public static void main(String[] args) {
        ArrayList<String> list= new ArrayList<>();
        list.add("rahul");
        list.add("shanti");
        list.add("rohit");
        list.add("mohit");
        list.add("om");
        System.out.println(list);
        Iterator<String> it= list.iterator();
       // System.out.println(it.hasNext());
        while (it.hasNext()) {
            String data = it.next();
            if (data.startsWith("r")) {
                it.remove();
            }
        }
            System.out.println(list);

    }
}
