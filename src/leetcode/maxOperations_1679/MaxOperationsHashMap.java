package leetcode.maxOperations_1679;

import java.util.HashMap;

public class MaxOperationsHashMap {
    public static int maxOperations(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int count = 0;

        for (int num : nums) {
            int complement = k - num;
            if (map.getOrDefault(complement, 0) > 0){
                count++;
                map.put(complement, map.get(complement) - 1);
            } else {
                map.put(num, map.getOrDefault(num, 0) + 1);
            }
        }

        return count;
    }

    public static void main(String[] args) {
        int[] nums = {3,1,3,4,3};
        int k = 6;

        System.out.println(maxOperations(nums, k));
    }
}
