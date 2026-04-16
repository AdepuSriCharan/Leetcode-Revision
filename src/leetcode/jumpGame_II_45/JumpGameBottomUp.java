package leetcode.jumpGame_II_45;

public class JumpGameBottomUp {
    private int jump(int[] nums) {
        int n = nums.length;
        int[] dp = new int[n];

        for (int i = 1; i < n; i++) {
            dp[i] = Integer.MAX_VALUE;
        }

        for (int i = 0; i < n; i++) {
            for (int j = 1; j <= nums[i] && i + j < n; j++) {
                dp[i + j] = Math.min(dp[i + j], dp[i] + 1);
            }
        }
        return dp[n - 1];
    }
    public static void main(String[] args) {
        int[] nums = {2, 3, 1, 1, 4};

        JumpGameBottomUp sol = new JumpGameBottomUp();
        int result = sol.jump(nums);

        System.out.println("Minimum jumps: " + result);
    }
}
