package leetcode.distinctSubsequences_115;

public class DistinctSubsequences_1D_DP {
    public int numDistinct(String s, String t) {
        int m = t.length();
        int[] dp = new int[m + 1];

        dp[0] = 1;

        for (int i = 0; i < s.length(); i++) {
            for (int j = m; j >= 1; j--) {
                if (s.charAt(i) == t.charAt(j - 1)) {
                    dp[j] += dp[j - 1];
                }
            }
        }

        return dp[m];
    }
    public static void main(String[] args) {
        DistinctSubsequences_1D_DP obj = new DistinctSubsequences_1D_DP();
        String s = "rabbbit", t = "rabbit";
        System.out.println(obj.numDistinct(s, t));
    }
}
