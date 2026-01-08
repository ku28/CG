import java.util.Scanner;

public class StudentScorecardGenerator {

    public static int[][] generatePcmScores(int studentCount) {
        int[][] scores = new int[studentCount][3];
        for (int i = 0; i < studentCount; i++) {
            for (int j = 0; j < 3; j++) {
                scores[i][j] = 10 + (int) (Math.random() * 90); // two-digit score 10-99
            }
        }
        return scores;
    }

    public static double[][] computeTotalsAndStats(int[][] scores) {
        int n = scores.length;
        double[][] stats = new double[n][3]; // total, average, percentage
        for (int i = 0; i < n; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2];
            double average = total / 3.0;
            double percentage = (total / 300.0) * 100.0;

            average = Math.round(average * 100.0) / 100.0;
            percentage = Math.round(percentage * 100.0) / 100.0;

            stats[i][0] = total;
            stats[i][1] = average;
            stats[i][2] = percentage;
        }
        return stats;
    }

    public static void displayScorecard(int[][] scores, double[][] stats) {
        System.out.println("Stu\tPhysics\tChemistry\tMaths\tTotal\tAverage\tPercentage");

        for (int i = 0; i < scores.length; i++) {
            System.out.print((i + 1) + "\t");
            System.out.print(scores[i][0] + "\t" + scores[i][1] + "\t" + scores[i][2] + "\t");
            System.out.print((int) stats[i][0] + "\t");
            System.out.print(String.format("%.2f", stats[i][1]) + "\t");
            System.out.println(String.format("%.2f", stats[i][2]));
        }
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int studentCount = sc.nextInt();

            int[][] scores = generatePcmScores(studentCount);
            double[][] stats = computeTotalsAndStats(scores);
            displayScorecard(scores, stats);
        }
    }
}
