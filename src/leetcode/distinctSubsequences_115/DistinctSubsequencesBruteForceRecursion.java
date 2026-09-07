package leetcode.distinctSubsequences_115;

public class DistinctSubsequencesBruteForceRecursion {
    public int numDistinct(String s, String t) {
        return solve(s, t, 0, 0);
    }

    private int solve(String s, String t, int i, int j) {
        if (j == t.length()){
            return 1;
        }
        if (i == s.length()){
            return 0;
        }

        int ans = solve(s, t, i + 1, j);

        if (s.charAt(i) == t.charAt(j)) {
            ans += solve(s, t, i + 1, j + 1);
        }

        return ans;
    }

    public static void main(String[] args) {
        String s = "rabbbit", t = "rabbit";
        System.out.println(new DistinctSubsequencesBruteForceRecursion().numDistinct(s, t));
    }
}
