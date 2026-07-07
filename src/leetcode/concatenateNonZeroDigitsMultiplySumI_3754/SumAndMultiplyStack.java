package leetcode.concatenateNonZeroDigitsMultiplySumI_3754;

import java.util.Stack;

public class SumAndMultiplyStack {
    private long sumAndMultiply(int n) {
        Stack<Integer> stack = new Stack<>();
        int sum = 0;

        while (n > 0) {
            int digit = n % 10;

            if (digit != 0) {
                stack.push(digit);
                sum += digit;
            }

            n /= 10;
        }

        long res = 0;

        while (!stack.isEmpty()) {
            res = res * 10 + stack.pop();
        }

        return res * sum;
    }
    public static void main(String[] args) {
        SumAndMultiplyStack obj = new SumAndMultiplyStack();
        System.out.println(obj.sumAndMultiply(100));
    }
}
