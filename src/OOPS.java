import org.w3c.dom.ls.LSOutput;

public class OOPS {
   private String name;
   private int age;
    //default
    public  OOPS()
    {
        System.out.println("Hello World");

    }
    //parametrized
    public OOPS(String n, int a){
        name = n;
        age = a;
    }
    public void show()
    {
        System.out.println(name);
        System.out.println(age);
    }
    public class test{
//        OOPS o =new OOPS();
//        o.name="Hello";
//        o.age = 50;
    }
    public static void main(String[] args) {
       OOPS o = new OOPS();
       o.name="hello alex";
        o.age=50;
        o.show();
        o.name="Hello ram";
        o.age=60;
//       OOPS o1 = new OOPS("Isha",20);
       o.show();
    }
}
