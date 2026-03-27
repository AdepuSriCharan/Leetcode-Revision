package leetcode.basicCalculator_224;

import java.util.Stack;

public class CalculatorStack {
    private static int calculate(String s) {
        Stack<Integer> stack = new Stack<>();

        int result = 0;
        int number = 0;
        int sign = 1;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (Character.isDigit(c)){
                number = number * 10 + (c - '0');
            }
            else if (c == '+') {
                result += sign * number;
                number = 0;
                sign = 1;
            }
            else if (c == '-') {
                result += sign * number;
                number = 0;
                sign = -1;
            }
            else if (c == '(') {
                stack.push(result);
                stack.push(sign);

                result = 0;
                sign = 1;
            }
            else if (c == ')') {
                result += sign * number;
                number = 0;

                result *= stack.pop();
                result += stack.pop();
            }
        }

        result += sign * number;
        return result;
    }

    public static void main(String[] args) {

        String s1 = "1 + 1";
        String s2 = " 2-1 + 2 ";
        String s3 = "(1+(4+5+2)-3)+(6+8)";

        System.out.println("Result 1: " + calculate(s1));
        System.out.println("Result 2: " + calculate(s2));
        System.out.println("Result 3: " + calculate(s3));
    }
}
