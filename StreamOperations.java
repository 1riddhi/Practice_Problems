import java.util.*;

public class StreamOperations {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("abcdefgh", "abcd", "abc", "pqrs", "pqrst", "opqrst");


        list.stream().filter(s -> s.length() > 5).map(String::toUpperCase).forEach(System.out::println);

    }
}
