import java.util.*;
class Students {
    int age;
    String name;
    int RollN;

    public Students(int age, String name, int RollN) {
        this.age = age;
        this.name = name;
        this.RollN = RollN;
    }

    public String toString() {
        return age + " " + name + " " + RollN;
    }
}
    class SortByName implements Comparator<Students>{
        public int compare(Students s1,Students s2){
            return s1.name.compareTo(s2.name);
        }


    }

public class CF2 {
    public static void main(String[] args) {
        ArrayList<Students> list=new ArrayList<>();
        list.add(new Students(12,"isha",024));
        list.add(new Students(18,"neha",025));
        list.add(new Students(19,"siya",026));
        Collections.sort(list,new SortByName());
        for (Students s: list){
            System.out.println(s);
        }


    }
}
