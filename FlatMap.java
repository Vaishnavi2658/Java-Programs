import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMap {
    public static void main(String[] args) {
        Department itDepartment = new Department("IT", Arrays.asList(
                new Employee("John", "IT", 90000),
                new Employee("Mike", "IT", 95000)
        ));
        
        Department hrDepartment = new Department("HR", Arrays.asList(
                new Employee("Jane", "HR", 80000),
                new Employee("Sara", "HR", 85000)
        ));

        List<Department> departments = Arrays.asList(itDepartment, hrDepartment);

        // Combine all employees from all departments into one list
        List<Employee> allEmployees = departments.stream()
            .flatMap(dept -> dept.getEmployees().stream())
            .collect(Collectors.toList());

        allEmployees.forEach(emp -> System.out.println(emp.getName())); // John, Mike, Jane, Sara
    }
}

class Department {
    private String name;
    private List<Employee> employees;

    public Department(String name, List<Employee> employees) {
        this.name = name;
        this.employees = employees;
    }

    public List<Employee> getEmployees() {
        return employees;
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
