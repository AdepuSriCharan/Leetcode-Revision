package leetcode.jumpGame_II_45;

public class JumpGameMemoization {
    private int jump(int[] nums) {
        Integer[] dp = new Integer[nums.length];
        return jumpRecursion(nums, 0, dp);
    }

    private int jumpRecursion(int[] nums, int index, Integer[] dp) {

        if (index >= nums.length - 1) return 0;
        if (dp[index] != null) return dp[index];
        int minJumps = Integer.MAX_VALUE;

        for (int j = 1; j <= nums[index]; j++) {
            int next = jumpRecursion(nums, index + j, dp);
            if (next != Integer.MAX_VALUE) {
                minJumps = Math.min(minJumps, 1 + next);
            }

        }
        return dp[index] = minJumps;
    }

    public static void main(String[] args) {
        int[] nums = {2, 3, 1, 1, 4};

        JumpGameMemoization jump = new JumpGameMemoization();
        int result = jump.jump(nums);

        System.out.println("Minimum jumps: " + result);
    }
}
