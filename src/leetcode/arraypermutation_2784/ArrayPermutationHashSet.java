package leetcode.arraypermutation_2784;

import java.util.HashSet;

public class ArrayPermutationHashSet {
    public static boolean isGood(int[] nums) {
        int n = 0;
        for (int num : nums) {
            n = Math.max(n, num);
        }
        if (nums.length != n + 1) {
            return false;
        }

        HashSet<Integer> set = new HashSet<>();
        int maxCount = 0;
        for (int num : nums) {
            if (num == n) {
                maxCount++;
            } else {
                if (set.contains(num)) {
                    return false;
                }
                set.add(num);
            }
        }
        for (int i = 1; i < n; i++) {
            if (!set.contains(i)) {
                return false;
            }
        }

        return maxCount == 2;
    }
    public static void main(String[] args) {
        int[] nums = {1, 3, 3, 2};
        System.out.println(isGood(nums));
    }
}
