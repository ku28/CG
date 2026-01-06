import java.util.Scanner;

public class StudentGrades2D {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the number of students: ");
            int number = sc.nextInt();
            
            double[][] marks = new double[number][3];
            double[] percentage = new double[number];
            String[] grade = new String[number];
            
            String[] subjects = {"Physics", "Chemistry", "Maths"};
            
            System.out.println("\nEnter marks for each student (out of 100):");
            for (int i = 0; i < number; i++) {
                System.out.println("\nStudent " + (i + 1) + ":");
                
                for (int j = 0; j < 3; j++) {
                    System.out.print(subjects[j] + " marks: ");
                    marks[i][j] = sc.nextDouble();
                    
                    if (marks[i][j] < 0) {
                        System.out.println("Invalid marks! Enter positive values.");
                        i--;
                        break;
                    }
                }
            }
            
            for (int i = 0; i < number; i++) {
                double totalMarks = 0;
                for (int j = 0; j < 3; j++) {
                    totalMarks += marks[i][j];
                }
                percentage[i] = (totalMarks / 300) * 100;
                
                if (percentage[i] >= 80) {
                    grade[i] = "A";
                } else if (percentage[i] >= 70) {
                    grade[i] = "B";
                } else if (percentage[i] >= 60) {
                    grade[i] = "C";
                } else if (percentage[i] >= 50) {
                    grade[i] = "D";
                } else if (percentage[i] >= 40) {
                    grade[i] = "E";
                } else {
                    grade[i] = "R";
                }
            }
            
            System.out.println("\n--- Student Grade Report ---");
            System.out.println("Student\tPhysics\tChemistry\tMaths\tPercentage\tGrade");
            System.out.println("-------\t-------\t---------\t-----\t----------\t-----");
            for (int i = 0; i < number; i++) {
                System.out.printf("%d\t%.2f\t%.2f\t\t%.2f\t%.2f%%\t\t%s%n",
                        (i + 1), marks[i][0], marks[i][1], marks[i][2], percentage[i], grade[i]);
            }
        }
    }
}
