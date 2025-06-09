import java.util.Arrays;
import java.util.*;

public class PriceSum {
    public static void main(String[] args) {
        List<Integer> prices = Arrays.asList(999, 1000, 1500, 1000, 2000);

        int totalSum = prices.stream()
                .distinct()
                .filter(price -> price > 1000)
                .reduce(0, Integer::sum);
        System.out.println("Total sum:" + totalSum);
    }
}