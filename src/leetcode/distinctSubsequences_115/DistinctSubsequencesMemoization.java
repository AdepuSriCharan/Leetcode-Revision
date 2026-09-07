package leetcode.distinctSubsequences_115;

public class DistinctSubsequencesMemoization {
    public int numDistinct(String s, String t) {
        Integer[][] memo = new Integer[s.length()][t.length()];
        return solve(s, t, 0, 0, memo);
    }

    private int solve(String s, String t, int i, int j, Integer[][] memo) {
        if (j == t.length()){
            return 1;
        }
        if (i == s.length()){
            return 0;
        }

        if (memo[i][j] != null){
            return memo[i][j];
        }

        int ans = solve(s, t, i + 1, j, memo);

        if (s.charAt(i) == t.charAt(j)) {
            ans += solve(s, t, i + 1, j + 1, memo);
        }

        return memo[i][j] = ans;
    }

    public static void main(String[] args) {
        String s = "rabbbit", t = "rabbit";
        System.out.println(new DistinctSubsequencesMemoization().numDistinct(s, t));
    }
}
