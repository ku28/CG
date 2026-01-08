import java.util.Scanner;

public class CardDeckDistributor {

    public static String[] initializeDeck(String[] suits, String[] ranks) {
        int numOfCards = suits.length * ranks.length;
        String[] deck = new String[numOfCards];
        int index = 0;

        for (String suit : suits) {
            for (String rank : ranks) {
                deck[index] = rank + " of " + suit;
                index++;
            }
        }

        return deck;
    }

    public static String[] shuffleDeck(String[] deck) {
        int n = deck.length;

        for (int i = 0; i < n; i++) {
            int randomCardNumber = i + (int) (Math.random() * (n - i));

            String temp = deck[i];
            deck[i] = deck[randomCardNumber];
            deck[randomCardNumber] = temp;
        }

        return deck;
    }

    public static String[][] distributeDeck(String[] deck, int numCards, int numPlayers) {
        if (numCards * numPlayers > deck.length) {
            System.out.println("Not enough cards to distribute");
            return new String[0][0];
        }

        String[][] players = new String[numPlayers][numCards];
        int cardIndex = 0;

        for (int i = 0; i < numCards; i++) {
            for (int j = 0; j < numPlayers; j++) {
                players[j][i] = deck[cardIndex];
                cardIndex++;
            }
        }

        return players;
    }

    public static void printPlayers(String[][] players) {
        for (int i = 0; i < players.length; i++) {
            System.out.println("Player " + (i + 1) + " cards:");
            for (String player : players[i]) {
                System.out.println("  " + player);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String[] suits = { "Hearts", "Diamonds", "Clubs", "Spades" };
            String[] ranks = { "2", "3", "4", "5", "6", "7", "8", "9", "10", 
                             "Jack", "Queen", "King", "Ace" };

            String[] deck = initializeDeck(suits, ranks);
            deck = shuffleDeck(deck);

            int numCards = sc.nextInt();
            int numPlayers = sc.nextInt();

            String[][] players = distributeDeck(deck, numCards, numPlayers);

            if (players.length > 0) {
                printPlayers(players);
            }
        }
    }
}
