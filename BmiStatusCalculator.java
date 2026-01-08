import java.util.Scanner;

public class BmiStatusCalculator {

    public static String[] calculateBmiAndStatus(double weight, double height) {
        double heightInMeters = height / 100.0;
        double bmi = weight / (heightInMeters * heightInMeters);
        String status;

        if (bmi <= 18.4) {
            status = "Underweight";
        } else if (bmi >= 18.5 && bmi <= 24.9) {
            status = "Normal";
        } else if (bmi >= 25.0 && bmi <= 39.9) {
            status = "Overweight";
        } else {
            status = "Obese";
        }

        return new String[] { String.format("%.2f", bmi), status };
    }

    public static String[][] computeBmiData(double[][] heightWeightData) {
        int n = heightWeightData.length;
        String[][] results = new String[n][4];

        for (int i = 0; i < n; i++) {
            double weight = heightWeightData[i][0];
            double height = heightWeightData[i][1];

            String[] bmiAndStatus = calculateBmiAndStatus(weight, height);

            results[i][0] = String.format("%.2f", height);
            results[i][1] = String.format("%.2f", weight);
            results[i][2] = bmiAndStatus[0];
            results[i][3] = bmiAndStatus[1];
        }

        return results;
    }

    public static void displayBmiTable(String[][] data) {
        System.out.println("Person\tHeight(cm)\tWeight(kg)\tBMI\t\tStatus");
        System.out.println("-----------------------------------------------------------");
        for (int i = 0; i < data.length; i++) {
            System.out.println((i + 1) + "\t" + data[i][0] + "\t\t" + 
                             data[i][1] + "\t\t" + data[i][2] + "\t\t" + data[i][3]);
        }
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            double[][] heightWeightData = new double[10][2];

            for (int i = 0; i < 10; i++) {
                heightWeightData[i][0] = sc.nextDouble(); // weight
                heightWeightData[i][1] = sc.nextDouble(); // height
            }

            String[][] bmiData = computeBmiData(heightWeightData);
            displayBmiTable(bmiData);
        }
    }
}
