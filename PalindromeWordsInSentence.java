public class PalindromeWordsInSentence {
    public static void main(String[] args) {
        String sentence = "madam arora teaches malayalam";
        String[] words = sentence.split(" ");
        
        for (String word : words) {
            if (isPalindrome(word)) {
                System.out.println(word);
            }
        }
    }

    private static boolean isPalindrome(String word) {
        int left = 0;
        int right = word.length() - 1;
        while (left < right) {
            if (word.charAt(left) != word.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
