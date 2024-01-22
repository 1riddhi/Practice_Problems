import java.util.*;
import java.util.stream.Collectors;

public class MapTransformation {
    public static void main(String[] args) {

                Map<String, Integer> map = new HashMap<>();
        map.put("a", 1);
        map.put("b", 2);
        map.put("c", 3);

                // Using Stream API and lambda expressions to transform the map
                Map<String, Integer> newMap = map.entrySet().stream().collect(Collectors.toMap(Map.Entry::getKey,e->e.getValue()*e.getValue()));

                // Print the original and transformed maps
                System.out.println("Original Map: " + map);
                System.out.println("New Map: " + newMap);
    }
}

