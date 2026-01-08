
import java.util.Scanner;

public class SpringSeason {

    public static boolean isSpring(int month, int day) {
        // Spring season is from March 20 to June 20
        if (month == 3 && day >= 20) {
            return true;
        } else if (month == 4 || month == 5) {
            return true;
        } else if (month == 6 && day <= 20) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int month = sc.nextInt();
            int day = sc.nextInt();
            if (isSpring(month, day)) {
                System.out.println("Its a Spring Season");
            } else {
                System.out.println("Not a Spring Season");
            }
        }
    }
}
