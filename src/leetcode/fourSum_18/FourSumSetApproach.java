package leetcode.fourSum_18;

import java.util.*;

public class FourSumSetApproach {
    private static List<List<Integer>> fourSum(int[] nums, int target) {
        Set<List<Integer>> result = new HashSet<>();
        int n = nums.length;
        Arrays.sort(nums);

        for (int i = 0; i < n - 3; i++) {
            for (int j = i + 1; j < n - 2; j++) {
                Set<Long> set = new HashSet<>();

                for (int k = j + 1; k < n; k++) {
                    long sum = (long) nums[i] + nums[j] + nums[k];
                    long needed = target - sum;

                    if (set.contains(needed)){
                        List<Integer> quad = Arrays.asList(nums[i], nums[j], (int)needed, nums[k]);
                        Collections.sort(quad);
                        result.add(quad);
                    }
                    set.add((long) nums[k]);
                }
            }
        }
        return new ArrayList<>(result);
    }
    public static void main(String[] args) {

        int[] nums1 = {1, 0, -1, 0, -2, 2};
        int target1 = 0;

        System.out.println(fourSum(nums1, target1));

        int[] nums2 = {2, 2, 2, 2, 2};
        int target2 = 8;

        System.out.println(fourSum(nums2, target2));
    }
}
