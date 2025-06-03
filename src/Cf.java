import java.util.*;
class Student implements Comparable <Student>{
    int age;
    String name;
    public Student(int age,String name){
    this.age=age;
    this.name=name;
    }
    public String toString(){
        return age+ " " +name;
    }
    public int compareTo(Student s){
        return this.age-s.age;
    }
}
public class Cf {
    public static void main(String[] args) {
       ArrayList<Student> list= new ArrayList<>();
       list.add(new Student(12,"mahi"));
       list.add(new Student(18,"isha"));
       list.add(new Student(14,"pihu"));
       Collections.sort(list);
       for (Student s:list){
           System.out.println(s.toString());
       }

     //   System.out.println(s.list);
    }
}
