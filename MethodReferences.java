import java.beans.MethodDescriptor;
import java.util.*;

public class MethodReferences {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("pqr", "abc", "xyz");
    
        //static method reference

        System.out.println("sort using static method refernce: ");
        list.stream().sorted(MethodReferences::staticSort).forEach(System.out::println);

        //instance method reference
        System.out.println("sort using instance method refernce: ");
        MethodReferences obj=new MethodReferences();
        list.stream().sorted(obj::instanceSort).forEach(System.out::println);

        //constructor reference
        System.out.println("sort using constructor refernce: ");
        list.stream().sorted(String::compareTo).forEach(System.out::println);


    }

    public static int staticSort(String a, String b){
           return a.compareTo(b);
    }
    public int instanceSort(String a, String b){
        return a.compareTo(b);
    }
}
