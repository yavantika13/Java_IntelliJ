import java.util.*;
public class circle {
    public static void main(String[] args) {
        double radius,area;
        Scanner input= new Scanner(System.in);
        System.out.println("enter the radius of the circle");
        radius =input.nextDouble();
        area = 3.14* radius*radius;
        System.out.println("area of the cirecle is"+area);
    }
}
