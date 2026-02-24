import java.util.*;

public class FirstRepeatedString {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            String[] strings = new String[n];
            for (int i = 0; i < n; i++) {
                strings[i] = sc.next();
            }
            HashSet<String> set = new HashSet<>();
            String firstRepeated = null;
            for (String s : strings) {
                if (set.contains(s)) {
                    firstRepeated = s;
                    break;
                } else {
                    set.add(s);
                }
            }
            System.out.println(firstRepeated != null ? firstRepeated : "No repeated string found.");
        }
    }
}
