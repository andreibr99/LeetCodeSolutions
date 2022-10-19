public class Main {
    public static void main(String[] args) {
        int[] input = {9,9,9};
        int[] output = plusOne(input);
        for (int i = 0; i < output.length; i++) {
            System.out.print(output[i]);
        }

    }

    public static int[] plusOne(int[] digits) {
        int[] result = new int[digits.length + 1];
        int i = digits.length - 1;
        while (digits[i] == 9) {
            digits[i] = 0;
            if (i == 0) {
                result[0] = 1;
                for (int j = 1; j < result.length; j++) {
                    result[j] = digits[j - 1];
                    return result;
                }
            }
            i--;
        }
        digits[i] = digits[i] + 1;
        return digits;
    }
}
