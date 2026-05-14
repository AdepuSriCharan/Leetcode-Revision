package leetcode.arraypermutation_2784;

import java.util.Arrays;

public class ArrayPermutationSorting {
    public static boolean isGood(int[] nums) {
        Arrays.sort(nums);
        int n = nums[nums.length - 1];

        if (nums.length != n + 1) {
            return false;
        }

        for (int i = 0; i < n - 1; i++) {
            if (nums[i] != i + 1) {
                return false;
            }
        }

        return nums[n - 1] == n && nums[n] == n;
    }

    public static void main(String[] args) {
        int[] nums = {1, 3, 3, 2};
        System.out.println(isGood(nums));
    }
}
