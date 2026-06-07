package leetcode.binarySubArrays_930;

import java.util.HashMap;
import java.util.Map;

class BinarySubArrays {
     private static int numSubarraysWithSum(int[] nums, int goal) {
        int sum = 0;
        int count = 0;

        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);

        for (int num : nums) {
            sum += num;

            count += map.getOrDefault(sum - goal, 0);

            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }

        return count;
    }

    public static void main(String[] args) {
        int[] nums = {1, 0, 1, 0, 1};
        int goal = 2;

        System.out.println(numSubarraysWithSum(nums, goal));
    }
}