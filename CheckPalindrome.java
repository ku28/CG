
import java.util.Scanner;

public class CheckPalindrome {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int m = n;
            int rev = 0;
            while(n!=0){
                int d = n%10;
                rev = rev*10 + d;
                n = n/10;
            }
            if(m == rev){
                System.out.println("Palindrome");
            } else {
                System.out.println("Not a Palindrome");
            }
        }
    }
}
