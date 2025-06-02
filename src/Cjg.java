import java.util.*;
public class Cjg {
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
            if (data.length() < 3) {
                data = "bye";
            }
            if (!data.equals("rahul") && !data.equals("bye")) {
                it.set("hello");
            }
        }
            for (String words :list){
                System.out.println(words);


           // System.out.println(data);
        }
    }
}


