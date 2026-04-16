package leetcode.jumpGame_II_45;

public class JumpGameBruteForceRecursion {
    private int jump(int[] nums) {
        return jumpRecursion(nums, 0);
    }


    private int jumpRecursion(int[] nums, int index) {
        if (index >= nums.length - 1) return 0;
        int minJumps = Integer.MAX_VALUE;

        for (int j = 1; j <= nums[index]; j++) {
            int next = jumpRecursion(nums, index + j);
            if (next != Integer.MAX_VALUE) {
                minJumps = Math.min(minJumps, 1 + next);
            }
        }
        return minJumps;
    }
    public static void main(String[] args) {
        int[] nums = {2, 3, 1, 1, 4};

        JumpGameBruteForceRecursion sol = new JumpGameBruteForceRecursion();
        int result = sol.jump(nums);

        System.out.println("Minimum jumps: " + result);
    }
}
