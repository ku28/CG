import java.util.Scanner;

public class EmployeeBonus {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            double[] salary = new double[10];
            double[] yearsOfService = new double[10];
            double[] newSalary = new double[10];
            double[] bonusAmount = new double[10];
            
            double totalBonus = 0.0;
            double totalOldSalary = 0.0;
            double totalNewSalary = 0.0;
            
            System.out.println("Enter salary and years of service for 10 employees:");
            for (int i = 0; i < 10; i++) {
                System.out.println("\nEmployee " + (i + 1) + ":");
                
                System.out.print("Enter salary: ");
                salary[i] = sc.nextDouble();
                
                if (salary[i] <= 0) {
                    System.out.println("Invalid salary! Please enter a positive value.");
                    i--;
                    continue;
                }
                
                System.out.print("Enter years of service: ");
                yearsOfService[i] = sc.nextDouble();
                
                if (yearsOfService[i] < 0) {
                    System.out.println("Invalid years of service! Please enter a positive value.");
                    i--;
                }
            }
            
            for (int i = 0; i < 10; i++) {
                if (yearsOfService[i] > 5) {
                    bonusAmount[i] = salary[i] * 0.05;
                } else {
                    bonusAmount[i] = salary[i] * 0.02;
                }
                
                newSalary[i] = salary[i] + bonusAmount[i];
                totalBonus += bonusAmount[i];
                totalOldSalary += salary[i];
                totalNewSalary += newSalary[i];
            }
            
            System.out.println("\n--- Zara Company Bonus Report ---");
            System.out.println("Total Bonus Payout: " + totalBonus);
            System.out.println("Total Old Salary: " + totalOldSalary);
            System.out.println("Total New Salary: " + totalNewSalary);
        }
    }
}
