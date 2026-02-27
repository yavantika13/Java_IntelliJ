//multiple inheritance
interface X
{
    void show();
}
interface Y
{
    void display();
}
class Z implements X,Y
{

    public void show() {
        System.out.println("Hello from class X");
    }
    public void display() {
        System.out.println("Hello from class Y");
    }
}
public class inter {
    public static void main(String[] args) {
     Z z =new Z();
     z.show();
     z.display();
    }
}
