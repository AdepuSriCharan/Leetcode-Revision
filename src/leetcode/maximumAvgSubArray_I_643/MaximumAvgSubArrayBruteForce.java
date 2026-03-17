package leetcode.maximumAvgSubArray_I_643;

public class MaximumAvgSubArrayBruteForce {

    private static double findMaxAverage(int[] nums, int k) {
        double maxAvg = Double.NEGATIVE_INFINITY;

        for (int i = 0; i <= nums.length - k; i++) {
            int sum = 0;

            for (int j = i; j < i + k; j++) {
                sum += nums[j];
            }

            maxAvg = Math.max(maxAvg, (double) sum / k);
        }

        return maxAvg;
    }

    public static void main(String[] args) {
        int[] nums = {1, 12, -5, -6, 50, 3};
        int k = 4;

        double result = findMaxAverage(nums, k);
        System.out.println("Maximum Average: " + result);
    }
}