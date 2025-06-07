import java.util.*;
import java.util.stream.Collectors;

public class Filter {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(5,10,15,20,25);
        List<Integer> evenlist = list.stream()
                .map(n->n*5)
               .filter(n->n%2==0)
                .collect(Collectors.toList());
        System.out.println(evenlist);

    }
}
