import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FindFirst {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee("John", "IT", 90000),
                new Employee("Jane", "HR", 80000),
                new Employee("Mike", "IT", 95000),
                new Employee("Emily", "Sales", 85000)
        );


        Optional<Employee> firstITEmployee = employees.stream()
            .filter(emp -> emp.getDepartment().equals("IT"))
            .findFirst();

        firstITEmployee.ifPresent(emp -> System.out.println(emp.getName()));


        boolean highEarnerExists = employees.stream()
            .anyMatch(emp -> emp.getSalary() > 100000);

        System.out.println(highEarnerExists);
    }
}
