package leetcode.subsequence_392;

public class SubsequenceRecursion {

    private static boolean isSubsequence(String s, String t) {
        return subsequence(s, t, 0, 0);
    }

    private static boolean subsequence(String s, String t, int i, int j) {
        if (i == s.length()) return true;
        if (j == t.length()) return false;

        if (s.charAt(i) == t.charAt(j)) {
            return subsequence(s, t, i + 1, j + 1);
        } else {
            return subsequence(s, t, i, j + 1);
        }
    }

    public static void main(String[] args) {
        String s = "abc";
        String t = "ahbgdc";

        System.out.println(isSubsequence(s, t));
    }
}
