import java.util.Scanner;

public class BMICalculator {
    
    public static void calculateBMI(double[][] data) {
        for (double[] data1 : data) {
            double weight = data1[0];
            double heightInCm = data1[1];
            double heightInMeters = heightInCm / 100;
            data1[2] = weight / (heightInMeters * heightInMeters);
        }
    }
    
    public static String[] determineBMIStatus(double[][] data) {
        String[] statuses = new String[data.length];
        
        for (int i = 0; i < data.length; i++) {
            double bmi = data[i][2];
            
            if (bmi <= 18.4) {
                statuses[i] = "Underweight";
            } else if (bmi >= 18.5 && bmi <= 24.9) {
                statuses[i] = "Normal";
            } else if (bmi >= 25.0 && bmi <= 39.9) {
                statuses[i] = "Overweight";
            } else if (bmi >= 40.0) {
                statuses[i] = "Obese";
            }
        }
        
        return statuses;
    }
    
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            double[][] data = new double[10][3];
            
            for (int i = 0; i < 10; i++) {
                data[i][0] = sc.nextDouble();
                data[i][1] = sc.nextDouble();
            }
            
            calculateBMI(data);
            String[] statuses = determineBMIStatus(data);
            
            System.out.println("Person\tWeight(kg)\tHeight(cm)\tBMI\t\tStatus");
            
            for (int i = 0; i < 10; i++) {
                System.out.printf("%d\t%.2f\t\t%.2f\t\t%.2f\t\t%s%n", 
                    (i + 1), data[i][0], data[i][1], data[i][2], statuses[i]);
            }
        }
    }
}
