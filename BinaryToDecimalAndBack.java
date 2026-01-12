public class BinaryToDecimalAndBack {
    public static int binaryToDecimal(String binaryStr) {
        int decimalValue = 0;
        int base = 1;

        for (int i = binaryStr.length() - 1; i >= 0; i--) {
            if (binaryStr.charAt(i) == '1') {
                decimalValue += base;
            }
            base *= 2;
        }
        return decimalValue;
    }

    public static String decimalToBinary(int decimalNum) {
        if (decimalNum == 0) {
            return "0";
        }

        StringBuilder binaryStr = new StringBuilder();
        while (decimalNum > 0) {
            int remainder = decimalNum % 2;
            binaryStr.insert(0, remainder);
            decimalNum /= 2;
        }
        return binaryStr.toString();
    }

    public static void main(String[] args) {
        String binaryStr = "1101";
        int decimalValue = binaryToDecimal(binaryStr);
        System.out.println("Binary to Decimal: " + binaryStr + " -> " + decimalValue);

        int decimalNum = 5;
        String binaryResult = decimalToBinary(decimalNum);
        System.out.println("Decimal to Binary: " + decimalNum + " -> " + binaryResult);
    }
}
