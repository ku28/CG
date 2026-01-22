import java.util.ArrayList;
import java.util.List;

class Course {
    private final String name;
    private final List<Student> students;

    public Course(String name) {
        this.name = name;
        this.students = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void enrollStudent(Student student) {
        if (!students.contains(student)) {
            students.add(student);
            student.addCourse(this);
        }
    }

    public void showEnrolledStudents() {
        System.out.println("Students enrolled in " + name + ":");
        for (Student s : students) {
            System.out.println(s.getName());
        }
    }
}

class Student {
    private final String name;
    private final List<Course> courses;

    public Student(String name) {
        this.name = name;
        this.courses = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addCourse(Course course) {
        if (!courses.contains(course)) {
            courses.add(course);
        }
    }

    public void viewCourses() {
        System.out.println(name + " is enrolled in:");
        for (Course c : courses) {
            System.out.println(c.getName());
        }
    }
}

class School {
    private final String name;
    private final List<Student> students;

    public School(String name) {
        this.name = name;
        this.students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        if (!students.contains(student)) {
            students.add(student);
        }
    }

    public void showStudents() {
        System.out.println("Students in " + name + ":");
        for (Student s : students) {
            System.out.println(s.getName());
        }
    }
}

public class SchoolStudentsCourses {
    public static void main(String[] args) {
        School school = new School("Greenwood High");
        Student alice = new Student("Alice");
        Student bob = new Student("Bob");
        Student carol = new Student("Carol");

        school.addStudent(alice);
        school.addStudent(bob);
        school.addStudent(carol);

        Course math = new Course("Mathematics");
        Course sci = new Course("Science");
        Course eng = new Course("English");

        math.enrollStudent(alice);
        math.enrollStudent(bob);
        sci.enrollStudent(alice);
        sci.enrollStudent(carol);
        eng.enrollStudent(bob);
        eng.enrollStudent(carol);

        alice.viewCourses();
        bob.viewCourses();
        carol.viewCourses();

        math.showEnrolledStudents();
        sci.showEnrolledStudents();
        eng.showEnrolledStudents();
    }
}
