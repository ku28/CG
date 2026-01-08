import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the number of persons: ");
            int number = sc.nextInt();
            
            double[] weight = new double[number];
            double[] height = new double[number];
            double[] bmi = new double[number];
            String[] weightStatus = new String[number];
            
            System.out.println("\nEnter weight (kg) and height (m) for each person:");
            for (int i = 0; i < number; i++) {
                System.out.println("\nPerson " + (i + 1) + ":");
                System.out.print("Weight (kg): ");
                weight[i] = sc.nextDouble();
                System.out.print("Height (m): ");
                height[i] = sc.nextDouble();
            }
            
            for (int i = 0; i < number; i++) {
                bmi[i] = weight[i] / (height[i] * height[i]);
                
                if (bmi[i] <= 18.4) {
                    weightStatus[i] = "Underweight";
                } else if (bmi[i] >= 18.5 && bmi[i] <= 24.9) {
                    weightStatus[i] = "Normal";
                } else if (bmi[i] >= 25.0 && bmi[i] <= 39.9) {
                    weightStatus[i] = "Overweight";
                } else {
                    weightStatus[i] = "Obese";
                }
            }
            
            System.out.println("\n--- BMI Report ---");
            System.out.println("Person\tHeight(m)\tWeight(kg)\tBMI\t\tStatus");
            for (int i = 0; i < number; i++) {
                System.out.printf("%d\t%.2f\t\t%.2f\t\t%.2f\t\t%s%n",
                        (i + 1), height[i], weight[i], bmi[i], weightStatus[i]);
            }
        }
    }
}
