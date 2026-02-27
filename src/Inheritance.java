//single
class A{
        void show(){
            System.out.println("hello from class A");
        }
    }
    class B extends A{
       void display(){
           System.out.println("hello from class B");
       }
    }
    // multilevel
    class C extends B{
    void displayagain(){
        System.out.println("hello from class C");
    }
    }
    // multiple
class D extends A{
    void showagain(){
        System.out.println("hello from class D");
    }
}
public class Inheritance {
    public static void main(String[] args) {
        D d1 = new D();
        d1.show();
        d1.showagain();
    }
}
