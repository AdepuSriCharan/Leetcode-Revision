package leetcode.reverseOnlyLetters_917;

import java.util.ArrayList;
import java.util.List;

public class ReverseLettersExtraSpace {
    private static String reverseOnlyLetters(String s) {
        List<Character> letters = new ArrayList<>();

        for (char c : s.toCharArray()) {
            if (Character.isLetter(c)) {
                letters.add(c);
            }
        }

        StringBuilder result = new StringBuilder();
        int index = letters.size() - 1;

        for (char c : s.toCharArray()) {
            if (Character.isLetter(c)) {
                result.append(letters.get(index--));
            } else {
                result.append(c);
            }
        }

        return result.toString();
    }
    public static void main(String[] args) {

        String input1 = "ab-cd";
        String input2 = "a-bC-dEf-ghIj";
        String input3 = "Test1ng-Leet=code-Q!";

        System.out.println(reverseOnlyLetters(input1));
        System.out.println(reverseOnlyLetters(input2));
        System.out.println(reverseOnlyLetters(input3));
    }
}
