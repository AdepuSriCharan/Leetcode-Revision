package leetcode.reverseInteger_7;

public class ReverseIntegerString {

    public static int reverse(int x) {

        boolean negative = x < 0;
        String s = Integer.toString(Math.abs(x));
        String reversed = new StringBuilder(s).reverse().toString();
        try {
            int result = Integer.parseInt(reversed);
            return negative ? -result : result;
        } catch (NumberFormatException e) {
            return 0;
        }
    }

    public static void main(String[] args) {
        int x = 120;
        int result = reverse(x);
        System.out.println("Reversed number: " + result);
    }
}