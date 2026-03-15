package leetcode.validParentheses_20;

import java.util.Stack;

/*
Time Complexity: O(n)
Space Complexity: O(n)
 */
public class ValidParenthesesStack {

    private static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()){
            if (c == '(' || c == '{' || c == '['){
                stack.push(c);
            } else {
                if (stack.empty()){
                    return false;
                }

                char top = stack.pop();

                if (c == ')' && top != '(')
                    return false;
                if (c == ']' && top != '[')
                    return false;
                if (c == '}' && top != '{')
                    return false;
            }
        }

        return stack.isEmpty();
    }

    public static void main(String[] args) {


        String s1 = "()";
        String s2 = "()[]{}";
        String s3 = "(]";

        System.out.println(s1 + " -> " + isValid(s1));
        System.out.println(s2 + " -> " + isValid(s2));
        System.out.println(s3 + " -> " + isValid(s3));

    }
}