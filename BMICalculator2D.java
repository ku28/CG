import java.util.Scanner;

public class BMICalculator2D {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the number of persons: ");
            int number = sc.nextInt();
            
            double[][] personData = new double[number][3];
            String[] weightStatus = new String[number];
            
            System.out.println("\nEnter weight (kg) and height (m) for each person:");
            for (int i = 0; i < number; i++) {
                System.out.println("\nPerson " + (i + 1) + ":");
                
                System.out.print("Weight (kg): ");
                personData[i][0] = sc.nextDouble();
                
                while (personData[i][0] <= 0) {
                    System.out.print("Invalid weight! Enter a positive value: ");
                    personData[i][0] = sc.nextDouble();
                }
                
                System.out.print("Height (m): ");
                personData[i][1] = sc.nextDouble();
                
                while (personData[i][1] <= 0) {
                    System.out.print("Invalid height! Enter a positive value: ");
                    personData[i][1] = sc.nextDouble();
                }
            }
            
            for (int i = 0; i < number; i++) {
                personData[i][2] = personData[i][0] / (personData[i][1] * personData[i][1]);
                
                if (personData[i][2] <= 18.4) {
                    weightStatus[i] = "Underweight";
                } else if (personData[i][2] >= 18.5 && personData[i][2] <= 24.9) {
                    weightStatus[i] = "Normal";
                } else if (personData[i][2] >= 25.0 && personData[i][2] <= 39.9) {
                    weightStatus[i] = "Overweight";
                } else {
                    weightStatus[i] = "Obese";
                }
            }
            
            System.out.println("\n--- BMI Report ---");
            System.out.println("Person\tHeight(m)\tWeight(kg)\tBMI\t\tStatus");
            System.out.println("------\t---------\t----------\t---\t\t------");
            for (int i = 0; i < number; i++) {
                System.out.printf("%d\t%.2f\t\t%.2f\t\t%.2f\t\t%s%n",
                        (i + 1), personData[i][1], personData[i][0], personData[i][2], weightStatus[i]);
            }
        }
    }
}
