public class SpacesToHyphens {
    public static String replaceSpacesToHyphens(String input) {
        return input.replace(" ", "-");
    }

    public static void main(String[] args) {
        String testString = "This is a test string";
        String result = replaceSpacesToHyphens(testString);
        System.out.println(result);
    }
}
