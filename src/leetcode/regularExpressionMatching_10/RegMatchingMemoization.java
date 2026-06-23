package leetcode.regularExpressionMatching_10;

public class RegMatchingMemoization {
    static Boolean[][] memo;

    static boolean isMatch(String s, String p) {
        memo = new Boolean[s.length() + 1][p.length() + 1];
        return dfs(s, p, 0, 0);
    }

    static boolean dfs(String s, String p, int i, int j) {
        boolean ans;
        if (memo[i][j] != null)
            return memo[i][j];

        if (j == p.length()) {
            ans = (i == s.length());
        } else {

            boolean firstMatch = i < s.length() && (s.charAt(i) == p.charAt(j) || p.charAt(j) == '.');

            if (j + 1 < p.length() && p.charAt(j + 1) == '*') {
                ans = dfs(s, p, i, j + 2) || (firstMatch && dfs(s, p, i + 1, j));
            } else {
                ans = firstMatch && dfs(s, p, i + 1, j + 1);
            }
        }

        return memo[i][j] = ans;
    }

    public static void main(String[] args) {
        System.out.println(isMatch("aab", "c*a*b"));
    }
}
