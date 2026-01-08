public class EmployeeBonusSummary {

    public static double[][] generateSalaryAndService(int employeeCount) {
        double[][] data = new double[employeeCount][2];
        for (int i = 0; i < employeeCount; i++) {
            int salary = 10000 + (int) (Math.random() * 90000); // five-digit salary
            int years = 1 + (int) (Math.random() * 15); // 1 to 15 years
            data[i][0] = salary;
            data[i][1] = years;
        }
        return data;
    }

    public static double[][] calculateNewSalaryAndBonus(double[][] baseData) {
        int n = baseData.length;
        double[][] result = new double[n][2]; // [bonus, newSalary]
        for (int i = 0; i < n; i++) {
            double salary = baseData[i][0];
            double years = baseData[i][1];
            double rate = years > 5 ? 0.05 : 0.02;
            double bonus = salary * rate;
            double newSalary = salary + bonus;
            result[i][0] = bonus;
            result[i][1] = newSalary;
        }
        return result;
    }

    public static void displaySummary(double[][] baseData, double[][] bonusData) {
        double totalOldSalary = 0.0;
        double totalNewSalary = 0.0;
        double totalBonus = 0.0;

        System.out.println("Emp\tOldSalary\tYears\tBonus\tNewSalary");
        System.out.println("-----------------------------------------------");

        for (int i = 0; i < baseData.length; i++) {
            double oldSalary = baseData[i][0];
            double years = baseData[i][1];
            double bonus = bonusData[i][0];
            double newSalary = bonusData[i][1];

            totalOldSalary += oldSalary;
            totalNewSalary += newSalary;
            totalBonus += bonus;

            System.out.printf("%d\t%.2f\t%.0f\t%.2f\t%.2f%n", (i + 1), oldSalary, years, bonus, newSalary);
        }

        System.out.println("-----------------------------------------------");
        System.out.printf("Totals\t%.2f\t-\t%.2f\t%.2f%n", totalOldSalary, totalBonus, totalNewSalary);
    }

    public static void main(String[] args) {
        int employeeCount = 10;
        double[][] baseData = generateSalaryAndService(employeeCount);
        double[][] bonusData = calculateNewSalaryAndBonus(baseData);
        displaySummary(baseData, bonusData);
    }
}
