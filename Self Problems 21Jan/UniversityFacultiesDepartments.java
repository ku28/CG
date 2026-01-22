import java.util.ArrayList;
import java.util.List;

class Faculty {
    private final String name;
    public Faculty(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
}

class Department2 {
    private final String name;
    public Department2(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
}

class University {
    private final String name;
    private final List<Department2> departments;
    private final List<Faculty> faculties;

    public University(String name) {
        this.name = name;
        this.departments = new ArrayList<>();
        this.faculties = new ArrayList<>();
    }

    public void addDepartment(Department2 dept) {
        departments.add(dept);
    }

    public void addFaculty(Faculty faculty) {
        faculties.add(faculty);
    }

    public void showDepartments() {
        System.out.println("Departments in " + name + ":");
        for (Department2 d : departments) {
            System.out.println(d.getName());
        }
    }

    public void showFaculties() {
        System.out.println("Faculties in " + name + ":");
        for (Faculty f : faculties) {
            System.out.println(f.getName());
        }
    }

    // Simulate deletion by clearing all departments
    public void deleteUniversity() {
        departments.clear();
        System.out.println("University '" + name + "' and all its departments have been deleted.");
    }
}

public class UniversityFacultiesDepartments {
    public static void main(String[] args) {
        University uni = new University("Global University");
        Department2 cs = new Department2("Computer Science");
        Department2 math = new Department2("Mathematics");
        Faculty profA = new Faculty("Prof. Alice");
        Faculty profB = new Faculty("Prof. Bob");

        uni.addDepartment(cs);
        uni.addDepartment(math);
        uni.addFaculty(profA);
        uni.addFaculty(profB);

        uni.showDepartments();
        uni.showFaculties();
        uni.deleteUniversity();
        // Faculties still exist
        System.out.println("Faculty members still exist: " + profA.getName() + ", " + profB.getName());
    }
}
