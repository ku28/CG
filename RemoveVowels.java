public class RemoveVowels {
    public static String removeVowels(String input) {
        return input.replaceAll("[AEIOUaeiou]", "");
    }

    public static void main(String[] args) {
        String testString = "This is an example string.";
        String result = removeVowels(testString);
        System.out.println(result);
    }
}
