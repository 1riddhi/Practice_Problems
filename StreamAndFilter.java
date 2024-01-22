import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamAndFilter {
   public static void main(String[] args) {
    String [] arr={"riddhi","prajapati","riddhiKP","rids","pra"};

    List<String> ans=Arrays.stream(arr).filter(s->!s.contains("rid")).map(String::toUpperCase).collect(Collectors.toList());

    System.out.println(ans);

   }

}
