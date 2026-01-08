import java.util.Scanner;

public class StudentVotingEligibility {

    public static int[] generateRandomAges(int studentCount) {
        int[] ages = new int[studentCount];
        for (int i = 0; i < studentCount; i++) {
            ages[i] = 10 + (int) (Math.random() * 90); // 2-digit ages 10-99
        }
        return ages;
    }

    public static String[][] checkVotingEligibility(int[] ages) {
        String[][] results = new String[ages.length][2];
        for (int i = 0; i < ages.length; i++) {
            results[i][0] = String.valueOf(ages[i]);
            if (ages[i] < 0) {
                results[i][1] = "false";
            } else if (ages[i] >= 18) {
                results[i][1] = "true";
            } else {
                results[i][1] = "false";
            }
        }
        return results;
    }

    public static void displayTable(String[][] data) {
        System.out.println("Student\tAge\tCan Vote");
        System.out.println("---------------------------");
        for (int i = 0; i < data.length; i++) {
            int age = Integer.parseInt(data[i][0]);
            String canVote = data[i][1];
            System.out.println((i + 1) + "\t" + age + "\t" + canVote);
        }
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int studentCount = sc.nextInt();

            int[] ages = generateRandomAges(studentCount);
            String[][] eligibility = checkVotingEligibility(ages);
            displayTable(eligibility);
        }
    }
}
