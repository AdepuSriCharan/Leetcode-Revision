package leetcode.maximumSumDistinctSubarrays_2461;

import java.util.HashMap;
import java.util.Map;

public class MaximumSumDistinctSubarrays {
    private static long maximumSubarraySum(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        long maxSum = 0, currentSum = 0;
        int left = 0;
        for (int right = 0; right < nums.length; right++){
            currentSum += nums[right];
            map.put(nums[right], map.getOrDefault(nums[right], 0) + 1);
            if (right - left + 1 > k){
                currentSum -= nums[left];
                map.put(nums[left], map.get(nums[left]) - 1);
                if (map.get(nums[left]) == 0){
                    map.remove(nums[left]);
                }
                left++;
            }
            if (right - left + 1 == k && map.size() ==k){
                maxSum = Math.max(maxSum, currentSum);
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
