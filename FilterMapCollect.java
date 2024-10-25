import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterMapCollect {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee("John", "IT", 90000),
                new Employee("Jane", "HR", 80000),
                new Employee("Mike", "IT", 95000),
                new Employee("Emily", "Sales", 85000)
        );


        List<String> itEmployeeNames = employees.stream()
            .filter(emp -> emp.getDepartment().equals("IT"))
            .map(Employee::getName)
            .collect(Collectors.toList());

        System.out.println(itEmployeeNames);
    }
}

class Employee {
    private String name;
    private String department;
    private int salary;

    public Employee(String name, String department, int salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public int getSalary() {
        return salary;
    }
}
