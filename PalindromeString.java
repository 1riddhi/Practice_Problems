import java.util.*;

public class PalindromeString {
    public static void main(String[] args) {
        List<String> list= Arrays.asList("aba","pqr","abba","hello");
        list.stream().filter(s->s.equals(new StringBuilder(s).reverse().toString())).forEach(System.out::println);
    }
}
