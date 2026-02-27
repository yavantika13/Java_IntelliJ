//class calculator{
//    int add(int a, int b){
//        return a+b;
//    }
//    int add(int a,int b,int c){
//        return a+b+c;
//    }
//    double add(double a,double b ){
//        return a+b;
//    }
//}
//public class polymorphism {
//    public static void main(String[] args) {
//        calculator c =new calculator();
//        System.out.println();
//    }
//}
class M{
    void show(){
        System.out.println("Hello from class M");
    }
}
class N extends M{
    void show(){
        System.out.println("Hello from class N");
    }
}
public class polymorphism {
  public static void main(String[] args) {
    M m = new N();
    m.show();
    }
}