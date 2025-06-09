import java.util.*;
import java.util.stream.Collectors;

public class Pratice1 {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Ram","Shyam","Om","Sita");
        List<String> result = names.stream()
                .filter(name->name.length()>3)
           //     .map(String::toString)
                .collect(Collectors.toList());
        System.out.println(result);
    }
}
