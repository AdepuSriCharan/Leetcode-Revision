package leetcode.maximumSumDistinctSubarrays_2461;

import java.util.HashSet;
import java.util.Set;

public class MaximumSumDistinctSubarraysHashSet {
    private static long maximumSubarraySum(int[] nums, int k) {
        Set<Integer> set = new HashSet<>();
        long maxSum = 0, currentSum = 0;
        int left = 0;
        for (int right = 0; right < nums.length; right++) {
            while(set.contains(nums[right])){
                set.remove(nums[left]);
                currentSum -= nums[left];
                left++;
            }
            set.add(nums[right]);
            currentSum += nums[right];

            while (right - left + 1 > k){
                set.remove(nums[left]);
                currentSum -= nums[left];
                left++;
            }
            if (right - left + 1 == k){
                maxSum = Math.max(currentSum, maxSum);
            }
        }
        return maxSum;
    }
    public static void main(String[] args) {
        int[] nums = {1,5,4,2,9,9,9};
        int k = 3;

        double result = maximumSubarraySum(nums, k);
        System.out.println("Maximum Average: " + result);
    }
}
