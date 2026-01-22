import java.util.ArrayList;
import java.util.List;

class Employee {
    private final String name;

    public Employee(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class Department {
    private final String name;
    private final List<Employee> employees;

    public Department(String name) {
        this.name = name;
        this.employees = new ArrayList<>();
    }

    public void addEmployee(Employee emp) {
        employees.add(emp);
    }

    public void showEmployees() {
        System.out.println("Employees in " + name + ":");
        for (Employee emp : employees) {
            System.out.println(emp.getName());
        }
    }
}

class Company {
    private final String name;
    private final List<Department> departments;

    public Company(String name) {
        this.name = name;
        this.departments = new ArrayList<>();
    }

    public void addDepartment(Department dept) {
        departments.add(dept);
    }

    public void showStructure() {
        System.out.println("Company: " + name);
        for (Department dept : departments) {
            dept.showEmployees();
        }
    }

    // Simulate deletion by clearing all departments and employees
    public void deleteCompany() {
        departments.clear();
        System.out.println("Company '" + name + "' and all its departments and employees have been deleted.");
    }
}

public class CompanyComposition {
    public static void main(String[] args) {
        Company comp = new Company("Tech Solutions");
        Department dev = new Department("Development");
        Department hr = new Department("HR");

        dev.addEmployee(new Employee("Alice"));
        dev.addEmployee(new Employee("Bob"));
        hr.addEmployee(new Employee("Carol"));

        comp.addDepartment(dev);
        comp.addDepartment(hr);

        comp.showStructure();
        comp.deleteCompany();
    }
}
