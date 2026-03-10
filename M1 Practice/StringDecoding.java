
import java.util.Scanner;

public class StringDecoding {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String s = sc.nextLine();
            StringBuilder sb = new StringBuilder();
            int cnt = 0;
            for (int i = 0; i < s.length(); i++) {
                if(s.charAt(i)=='1') cnt++;
                else {
                    sb.append((char) (64 + cnt));
                    cnt=0;
                }
            }
            if(cnt!=0) sb.append((char) (64 + cnt));
            System.out.println(sb.toString());
        }
    }
}
