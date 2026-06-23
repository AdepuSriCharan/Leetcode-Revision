package leetcode.regularExpressionMatching_10;

public class RegMatchingRecursion {
    static boolean isMatch(String s, String p) {
        return helper(s, p, 0, 0);
    }

    static boolean helper(String s, String p, int i, int j) {

        if (j == p.length())
            return i == s.length();

        boolean firstMatch =
                (i < s.length()) &&
                        (s.charAt(i) == p.charAt(j) ||
                                p.charAt(j) == '.');

        if (j + 1 < p.length() && p.charAt(j + 1) == '*') {

            return helper(s, p, i, j + 2) ||
                    (firstMatch && helper(s, p, i + 1, j));
        }

        return firstMatch &&
                helper(s, p, i + 1, j + 1);
    }

    public static void main(String[] args) {
        System.out.println(isMatch("aa", "a*"));
    }
}
