package leetcode.concatenateNonZeroDigitsMultiplySumI_3754;

public class SumAndMultiplyString {
    private long sumAndMultiply(int n) {
        String s = String.valueOf(n);

        long res = 0;
        int sum = 0;

        for (char ch : s.toCharArray()) {
            int digit = ch - '0';

            if (digit != 0) {
                res = res * 10 + digit;
                sum += digit;
            }
        }

        return res * sum;
    }

    public static void main(String[] args) {
        System.out.println(new SumAndMultiplyString().sumAndMultiply(123456));
    }
}
