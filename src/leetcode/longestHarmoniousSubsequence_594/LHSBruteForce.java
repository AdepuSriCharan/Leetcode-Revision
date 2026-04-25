package leetcode.longestHarmoniousSubsequence_594;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LHSBruteForce {
    private static int findLHS(int[] nums) {
        return helper(nums, 0, new ArrayList<>());
    }

    private static int helper(int[] nums, int index, List<Integer> temp) {
        if (index == nums.length) {
            if (temp.size() == 0)
                return 0;

            int min = Collections.min(temp);
            int max = Collections.max(temp);

            return (max - min == 1) ? temp.size() : 0;
        }

        temp.add(nums[index]);
        int take = helper(nums, index + 1, temp);
        temp.remove(temp.size() - 1);

        int skip = helper(nums, index + 1, temp);

        return Math.max(take, skip);
    }
    public static void main(String[] args) {
        int[] nums = {1,3,2,2,5,2,3,7};
        System.out.println(findLHS(nums));
    }
}
