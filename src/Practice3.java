import java.util.*;
import java.util.stream.Collectors;

public class Practice3 {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Java","Shyam","API");
        List<Integer> lengths = names.stream()
                .map(String::length)
                .collect(Collectors.toList());
        System.out.println(lengths);
    }
}
