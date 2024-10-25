import java.util.Arrays;
import java.util.List;

public class MapReduceForEach {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee("John", "IT", 90000),
                new Employee("Jane", "HR", 80000),
                new Employee("Mike", "IT", 95000),
                new Employee("Emily", "Sales", 85000)
        );

        int totalSalary = employees.stream()
            .map(Employee::getSalary)
            .reduce(0, Integer::sum);

        System.out.println("Total Salary: " + totalSalary);

        employees.stream()
            .map(Employee::getSalary)
            .forEach(salary -> System.out.println("Salary: " + salary));
    }
}
