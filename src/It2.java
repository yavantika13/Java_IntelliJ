import java.util.*;
public class It2 {
    public static void main(String[] args) {
        ArrayList<String> list= new ArrayList<>();
        list.add("rahul");
        list.add("shanti");
        list.add("rohit");
        list.add("mohit");
        list.add("om");
        ListIterator<String> it=list.listIterator();
        while (it.hasNext()) {
            String data = it.next();
            if (data.length()<3){
                data="bye";
            }
            System.out.println(data);
        }
    }
}
