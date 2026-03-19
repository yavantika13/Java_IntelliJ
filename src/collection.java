import java.util.*;
public class collection {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        System.out.println(list);
        list.add(40);
        list.set(2,50);
        System.out.println(list);
        System.out.println(list.get(1));
        list.remove(1);
        System.out.println(list);
        System.out.println(list.size());
        for(int i=0;i< list.size();i++){
            System.out.println(list.get(i));
        }
        for (int num:list){
            System.out.println(num);
        }
        System.out.println(list.contains(20));
        int t =100;
        if(list.contains(t)){
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
    }
}
