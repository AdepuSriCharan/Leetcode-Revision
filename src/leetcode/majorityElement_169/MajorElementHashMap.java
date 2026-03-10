package leetcode.majorityElement_169;

import java.util.HashMap;

public class MajorElementHashMap {
    public static void main(String[] args) {
        int[] nums = {2, 2, 1, 1, 1, 2, 2};
        int result = majorityElementHashmap(nums);
        System.out.println(result);
    }

    private static int majorityElementHashmap(int[] nums) {
        int major = nums.length/2;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums){
            map.put(num, map.getOrDefault(num, 0)+1);
            if (map.get(num) > major){
                return num;
            }
        }
        return -1;
    }
}
