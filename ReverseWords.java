import java.util.Scanner;

public class ReverseWords {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String str = sc.nextLine();
            String[] words = str.split(" ");
            StringBuilder sb = new StringBuilder();
            for(String word : words){
                for(int i=word.length()-1; i>=0; i--){
                    sb.append(word.charAt(i));
                }
                sb.append(" ");
            }
            System.out.println(sb.toString().trim());
        }
    }
}
