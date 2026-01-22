import java.util.ArrayList;
import java.util.List;

class Professor {
    private final String name;
    private final List<Course5> courses;

    public Professor(String name) {
        this.name = name;
        this.courses = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void assignCourse(Course5 course) {
        if (!courses.contains(course)) {
            courses.add(course);
            course.assignProfessor(this);
        }
    }
}

class Student5 {
    private final String name;
    private final List<Course5> courses;

    public Student5(String name) {
        this.name = name;
        this.courses = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void enrollCourse(Course5 course) {
        if (!courses.contains(course)) {
            courses.add(course);
            course.addStudent(this);
        }
    }
}

class Course5 {
    private final String name;
    private Professor professor;
    private final List<Student5> students;

    public Course5(String name) {
        this.name = name;
        this.students = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void assignProfessor(Professor prof) {
        this.professor = prof;
    }

    public void addStudent(Student5 student) {
        if (!students.contains(student)) {
            students.add(student);
        }
    }

    public void showCourseInfo() {
        System.out.println("Course: " + name);
        System.out.println("Professor: " + (professor != null ? professor.getName() : "None"));
        System.out.println("Students:");
        for (Student5 s : students) {
            System.out.println("- " + s.getName());
        }
    }
}

public class UniversityManagementSystem {
    public static void main(String[] args) {
        Professor profA = new Professor("Dr. Alice");
        Professor profB = new Professor("Dr. Bob");
        Student5 s1 = new Student5("John");
        Student5 s2 = new Student5("Mary");
        Student5 s3 = new Student5("Steve");

        Course5 math = new Course5("Mathematics");
        Course5 cs = new Course5("Computer Science");

        profA.assignCourse(math);
        profB.assignCourse(cs);

        s1.enrollCourse(math);
        s2.enrollCourse(math);
        s3.enrollCourse(cs);
        s1.enrollCourse(cs);

        math.showCourseInfo();
        cs.showCourseInfo();
    }
}
