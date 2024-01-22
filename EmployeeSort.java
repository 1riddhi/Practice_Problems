import java.util.Arrays;
import java.util.List;

public class EmployeeSort {
    public static void main(String[] args) {

        List<Employee> list = Arrays.asList(
                new Employee("riddhi", 1000000, 3),
                new Employee("name1", 20000, 5),
                new Employee("name2", 5000, 2),
                new Employee("name3", 15550, 7)
        );

        list.stream().sorted((e1,e2)->{return Double.compare(e2.getSalary(),e1.getSalary());}).forEach(System.out::println);


    }
}

class Employee {
    private String name;
    private double salary;
    private int experience;

    public Employee(String name, double salary, int yearsOfExperience) {
        this.name = name;
        this.salary = salary;
        this.experience = yearsOfExperience;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public int getExperience() {
        return experience;
    }

    @Override
    public String toString() {return "name = " + name +" salary = " + salary +" experience = " + experience;}




}
