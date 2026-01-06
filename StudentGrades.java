import java.util.Scanner;

public class StudentGrades {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the number of students: ");
            int number = sc.nextInt();
            
            double[] physicsMarks = new double[number];
            double[] chemistryMarks = new double[number];
            double[] mathsMarks = new double[number];
            double[] percentage = new double[number];
            String[] grade = new String[number];
            
            System.out.println("\nEnter marks for each student (out of 100):");
            for (int i = 0; i < number; i++) {
                System.out.println("\nStudent " + (i + 1) + ":");
                
                System.out.print("Physics marks: ");
                physicsMarks[i] = sc.nextDouble();
                
                if (physicsMarks[i] < 0) {
                    System.out.println("Invalid marks! Enter positive values.");
                    i--;
                    continue;
                }
                
                System.out.print("Chemistry marks: ");
                chemistryMarks[i] = sc.nextDouble();
                
                if (chemistryMarks[i] < 0) {
                    System.out.println("Invalid marks! Enter positive values.");
                    i--;
                    continue;
                }
                
                System.out.print("Maths marks: ");
                mathsMarks[i] = sc.nextDouble();
                
                if (mathsMarks[i] < 0) {
                    System.out.println("Invalid marks! Enter positive values.");
                    i--;
                }
            }
            
            for (int i = 0; i < number; i++) {
                double totalMarks = physicsMarks[i] + chemistryMarks[i] + mathsMarks[i];
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
                        (i + 1), physicsMarks[i], chemistryMarks[i], mathsMarks[i], percentage[i], grade[i]);
            }
        }
    }
}
