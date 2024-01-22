import  java.util.*;
import java.util.stream.Collectors;

class Student {
    private String name;
    private int age;
    private int grade;

    public Student(String name, int age, int grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getGrade() {
        return grade;
    }

    @Override
    public String toString() {
        return "name = "+name+" age = "+age+" grade = "+grade;
    }
}

public class StudentFiltering {
    public static void main(String[] args) {

        List<Student> list = new ArrayList<>();

        list.add(new Student("riddhi-1", 20, 99));
        list.add(new Student("riddhi-2", 30, 100));
        list.add(new Student("riddhi-3", 40, 90));

        System.out.println(list.stream().filter(s -> s.getAge() >= 30 && s.getGrade() >= 90).collect(Collectors.toList()));

    }
}


