public class CapitalFirstLetter {
    public static void main(String[] args) {
        String str = "hello world";
        StringBuilder result = new StringBuilder();

        for (String word : str.split(" ")) {
            if (word.length() > 0) {
                result.append(Character.toUpperCase(word.charAt(0)))
                        .append(word.substring(1))
                        .append(" ");
            }
        }

        System.out.println("String after capitalizing first letters: " + result.toString().trim());
    }
}
