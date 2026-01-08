public class FootballTeamHeightStats {

    public static int[] generateRandomHeights() {
        int[] heights = new int[11];
        for (int i = 0; i < heights.length; i++) {
            heights[i] = 150 + (int) (Math.random() * 101); // 150 to 250
        }
        return heights;
    }

    public static int sumHeights(int[] heights) {
        int sum = 0;
        for (int h : heights) {
            sum += h;
        }
        return sum;
    }

    public static double meanHeight(int[] heights) {
        int sum = sumHeights(heights);
        return (double) sum / heights.length;
    }

    public static int shortestHeight(int[] heights) {
        int min = heights[0];
        for (int h : heights) {
            if (h < min) {
                min = h;
            }
        }
        return min;
    }

    public static int tallestHeight(int[] heights) {
        int max = heights[0];
        for (int h : heights) {
            if (h > max) {
                max = h;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] heights = generateRandomHeights();

        System.out.println("Heights of players (in cm):");
        for (int h : heights) {
            System.out.print(h + " ");
        }
        System.out.println();

        int sum = sumHeights(heights);
        double mean = meanHeight(heights);
        int shortest = shortestHeight(heights);
        int tallest = tallestHeight(heights);

        System.out.println("Total height: " + sum + " cm");
        System.out.println("Average height: " + String.format("%.2f", mean) + " cm");
        System.out.println("Shortest player: " + shortest + " cm");
        System.out.println("Tallest player: " + tallest + " cm");
    }
}
