import java.util.*;
public class Filter1 {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(5,10,15,20,25);
        Optional<Integer> sum= list.stream().reduce((a,b)->a>b?a:b);
        System.out.println(sum);
    }
}
