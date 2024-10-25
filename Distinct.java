import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Distinct {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee("John", "IT", 90000),
                new Employee("Jane", "HR", 80000),
                new Employee("Mike", "IT", 95000),
                new Employee("Emily", "Sales", 85000)
        );

        List<String> distinctDepartments = employees.stream()
            .map(Employee::getDepartment)
            .distinct()
            .collect(Collectors.toList());

        System.out.println(distinctDepartments);
    }
}
