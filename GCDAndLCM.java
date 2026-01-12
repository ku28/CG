public class GCDAndLCM {
    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static int lcm(int a, int b) {
        return (a * b) / gcd(a, b);
    }

    public static void main(String[] args) {
        int num1 = 12;
        int num2 = 18;

        System.out.println("GCD of is " + gcd(num1, num2));
        System.out.println("LCM of is " + lcm(num1, num2));
    }
}
