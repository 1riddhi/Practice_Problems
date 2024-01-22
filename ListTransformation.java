import  java.util.*;
import java.util.stream.Collectors;

public class ListTransformation {
    public static void main(String[] args) {


                List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);

                list.stream().map(number -> number * number).filter(square -> square % 2 == 0).forEach(System.out::println);



    }
}
