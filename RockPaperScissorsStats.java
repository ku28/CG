import java.util.Scanner;

public class RockPaperScissorsStats {

    public static String getComputerChoice() {
        int random = (int) (Math.random() * 3);
        return switch (random) {
            case 0 -> "rock";
            case 1 -> "paper";
            default -> "scissors";
        };
    }

    public static String findWinner(String userChoice, String computerChoice) {
        if (userChoice.equals(computerChoice)) {
            return "tie";
        }

        if (userChoice.equals("rock") && computerChoice.equals("scissors")) {
            return "user";
        } else if (userChoice.equals("rock") && computerChoice.equals("paper")) {
            return "computer";
        } else if (userChoice.equals("paper") && computerChoice.equals("rock")) {
            return "user";
        } else if (userChoice.equals("paper") && computerChoice.equals("scissors")) {
            return "computer";
        } else if (userChoice.equals("scissors") && computerChoice.equals("paper")) {
            return "user";
        } else if (userChoice.equals("scissors") && computerChoice.equals("rock")) {
            return "computer";
        }

        return "tie";
    }

    public static String[][] calculateStats(int userWins, int computerWins, int totalGames) {
        String[][] stats = new String[2][3];

        double userPercentage = (totalGames > 0) ? (userWins * 100.0 / totalGames) : 0;
        double computerPercentage = (totalGames > 0) ? (computerWins * 100.0 / totalGames) : 0;

        stats[0][0] = "User";
        stats[0][1] = String.valueOf(userWins);
        stats[0][2] = String.format("%.2f", userPercentage) + "%";

        stats[1][0] = "Computer";
        stats[1][1] = String.valueOf(computerWins);
        stats[1][2] = String.format("%.2f", computerPercentage) + "%";

        return stats;
    }

    public static void displayResults(String[] userChoices, String[] computerChoices,
            String[] winners, String[][] stats) {
        System.out.println("Game\tUser\t\tComputer\tWinner");
        System.out.println("-----------------------------------------------");
        for (int i = 0; i < userChoices.length; i++) {
            System.out.println((i + 1) + "\t" + userChoices[i] + "\t\t" +
                    computerChoices[i] + "\t\t" + winners[i]);
        }

        System.out.println("\nStatistics:");
        System.out.println("Player\t\tWins\tPercentage");
        System.out.println("---------------------------------------");
        for (String[] stat : stats) {
            System.out.println(stat[0] + "\t\t" + stat[1] + "\t" + stat[2]);
        }
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int numberOfGames = sc.nextInt();

            String[] userChoices = new String[numberOfGames];
            String[] computerChoices = new String[numberOfGames];
            String[] winners = new String[numberOfGames];

            int userWins = 0;
            int computerWins = 0;

            for (int i = 0; i < numberOfGames; i++) {
                userChoices[i] = sc.next();
                computerChoices[i] = getComputerChoice();
                winners[i] = findWinner(userChoices[i], computerChoices[i]);

                if (winners[i].equals("user")) {
                    userWins++;
                } else if (winners[i].equals("computer")) {
                    computerWins++;
                }
            }

            String[][] stats = calculateStats(userWins, computerWins, numberOfGames);
            displayResults(userChoices, computerChoices, winners, stats);
        }
    }
}
