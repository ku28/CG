public class OtpUniquenessValidator {

    public static int generateSixDigitOtp() {
        return 100000 + (int) (Math.random() * 900000);
    }

    public static boolean areOtpsNotAllSame(int[] otps) {
        int first = otps[0];
        for (int i = 1; i < otps.length; i++) {
            if (otps[i] != first) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] otps = new int[10];

        System.out.println("Generated OTPs:");
        for (int i = 0; i < otps.length; i++) {
            otps[i] = generateSixDigitOtp();
            System.out.print(otps[i] + " ");
        }
        System.out.println();

        boolean uniqueEnough = areOtpsNotAllSame(otps);
        System.out.println("All ten OTPs are not the same: " + uniqueEnough);
    }
}
