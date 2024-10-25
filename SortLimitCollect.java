import java.util.Arrays;
import java.util.List;
import java.util.Comparator;
import java.util.stream.Collectors;

public class SortLimitCollect {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee("John", "IT", 90000),
                new Employee("Jane", "HR", 80000),
                new Employee("Mike", "IT", 95000),
                new Employee("Emily", "Sales", 85000)
        );

        List<Employee> top2Employees = employees.stream()
            .sorted(Comparator.comparing(Employee::getSalary).reversed())
            .limit(2)
            .collect(Collectors.toList());

        top2Employees.forEach(emp -> System.out.println(emp.getName()));
    }
}
