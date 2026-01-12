public class RemoveSpecial {
    public static void main(String[] args) {
        String str = "Hello@World!123";
        StringBuilder cleanedStr = new StringBuilder();

        for (char ch : str.toCharArray()) {
            if (Character.isLetterOrDigit(ch)) {
                cleanedStr.append(ch);
            }
        }

        System.out.println("String after removing special characters: " + cleanedStr.toString());
    }
}
