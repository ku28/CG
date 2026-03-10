
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MaxOccuringChar {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String s = sc.nextLine();
            Map<Character, Integer>mp = new HashMap<>();
            int maxi = 0;
            for(char ch : s.toCharArray()) {
                mp.put(ch, mp.getOrDefault(ch, 0)+1);
                maxi = Math.max(maxi, mp.get(ch));
            }
            char maxChar = ' ';
            int cnt=0;
            for(Map.Entry<Character, Integer>entry : mp.entrySet()){
                if(entry.getValue()==maxi) {
                    maxChar = entry.getKey();
                    if(cnt>=1) System.out.println(0);
                    cnt++;
                }
            }
            if(cnt==1) System.out.println(maxChar);
        }
    }
}
