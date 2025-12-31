import java.util.Scanner;

public class BasicCalc {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        int sum = num1 + num2;
        int difference = num1 - num2;
        int product = num1 * num2;
        int division = num1 / num2;

        System.out.println("The addition, subtraction, multiplication, and division value of 2 numbers "
                + num1 + " and " + num2 + " is " + sum + ", "
                + difference + ", " + product + ", and " + division);
        sc.close();
    }
}
