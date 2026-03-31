package leetcode.containsDuplicate_217;

import java.util.Arrays;

public class containsDuplicateSorting {
    public boolean containsDuplicate(int[] nums) {

        Arrays.sort(nums);

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) {
                return true;
            }
        }

        return false;
    }
}
