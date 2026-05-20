package leetcode.slidingWindowMaximum_239;

import java.util.*;

public class SlidingWindowMax {
    private static int[] maxSlidingWindow(int[] nums, int k) {
        List<Integer> list = new ArrayList<>();
        int[] result = new int[nums.length - k + 1];
        int left = 0;
        for (int num : nums) {
            list.add(num);
            if (list.size() == k) {
                result[left] = Collections.max(list);
                list.remove(Integer.valueOf(nums[left]));
                left++;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        int[] nums = {1,3,-1,-3,5,3,6,7};
        int k = 3;

        int[] result = maxSlidingWindow(nums, k);
        System.out.println("Maximum : " + Arrays.toString(result));
    }
}
