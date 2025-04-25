public class Sb1
{
    public static void main(String[] args) {
        StringBuilder str=new StringBuilder(10);
        str.append("hello hiii byeee");
        // old*2+2
        System.out.println(str.length());
        System.out.println(str.capacity());
    }
}
