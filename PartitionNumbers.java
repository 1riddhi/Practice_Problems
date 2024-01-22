import java.util.*;
import java.util.stream.Collectors;

public class PartitionNumbers {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        Map<Boolean, List<Integer>> map = numbers.stream().collect(Collectors.partitioningBy(number -> number % 2 == 0));

        System.out.println("Even Numbers: " + map.get(true));
        System.out.println("Odd Numbers: " + map.get(false));


    }
}
