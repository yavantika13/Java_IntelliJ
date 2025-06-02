import java.util.*;
public class It1 {
    public static void main(String[] args) {
        ArrayList<String> list= new ArrayList<>();
        list.add("rahul");
        list.add("shanti");
        list.add("rohit");
        list.add("mohit");
        list.add("om");
        ListIterator<String> it=list.listIterator();
        while (it.hasNext()){
            String data = it.next();
            System.out.println(data);
        }
        System.out.println("alag hu m");
        while (it.hasPrevious()){
            String preData= it.previous();
            System.out.println(preData);
        }

    }
}
