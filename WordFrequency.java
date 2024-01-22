import java.util.*;
import java.util.stream.Collectors;

public class WordFrequency {
    public static void main(String[] args) {
        String str="hello my name is riddhi and how are you? hello riddhi";

        List<String> list= Arrays.asList(str.split(" "));
        List<String> ignoreWords= Arrays.asList("and","the","is");

        Map<String,Long> map=list.stream().filter(s->!ignoreWords.contains(s)).collect(Collectors.groupingBy(String::toString,Collectors.counting()));

        map.entrySet().stream().sorted((e1,e2)->e2.getValue().compareTo(e1.getValue())).forEach(System.out::println);

    }
}
