import java.lang.Exception;

public class Exception1
{
    public static void main(String[] args) {
        int [] arr={1,2,3,4,5};
        try{
            System.out.println(arr[8]);
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }catch (ArithmeticException e){
            System.out.println(e);
        } finally {
            System.out.println("sb kuch thik h");
        }
        System.out.println("hello");
        System.out.println("hi");
        System.out.println("bye");
    }
}
