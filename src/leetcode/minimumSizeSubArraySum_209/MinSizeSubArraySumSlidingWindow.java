package leetcode.minimumSizeSubArraySum_209;

public class MinSizeSubArraySumSlidingWindow {
    private static int minSubArrayLen(int target, int[] nums) {
        int left = 0, minLength = Integer.MAX_VALUE, currentSum = 0;
        for (int right = 0; right < nums.length; right++) {
            currentSum += nums[right];

            while (currentSum >= target) {
                minLength = Math.min(minLength, right - left + 1);
                currentSum -= nums[left];
                left++;
            }
        }
        return minLength == Integer.MAX_VALUE ? 0 : minLength;
    }
    public static void main(String[] args) {
        int[] nums = {2,3,1,2,4,3};
        int k = 7;

        int result = minSubArrayLen(k, nums);
        System.out.println("Minimum Size: " + result);
    }
}
