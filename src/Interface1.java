interface walkable{
    void walk();
}
interface runnable {
    void run();

   // void print();
}
class Human implements walkable,runnable{

    public void walk() {
        System.out.println("walking");
    }


    public void run() {
        System.out.println("running");

    }
}
public class Interface1{
    public static void main(String[] args) {
        Human obj=new Human();
        obj.walk();
        obj.run();
    }
}
