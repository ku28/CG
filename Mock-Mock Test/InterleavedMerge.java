import java.util.Scanner;

public class InterleavedMerge {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String str1 = sc.nextLine();
            String str2 = sc.nextLine();
            StringBuilder mergeStr = new StringBuilder();
            int maxLength = Math.max(str1.length(), str2.length());
            for (int i = 0; i < maxLength; i++) {
                if (i < str1.length()) {
                    mergeStr.append(str1.charAt(i));
                }
                if (i < str2.length()) {
                    mergeStr.append(str2.charAt(i));
                }
            }
            System.out.println(mergeStr.toString());
        }
    }
}
