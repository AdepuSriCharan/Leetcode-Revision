package leetcode.containsDuplicate_III_220;

import java.util.TreeSet;

public class ContainsDuplicateSlidingWindowTreeSet {
    private boolean containsNearbyAlmostDuplicate(int[] nums, int indexDiff, int valueDiff) {

        TreeSet<Long> set = new TreeSet<>();

        for (int i = 0; i < nums.length; i++) {

            Long candidate = set.ceiling((long) nums[i] - valueDiff);

            if (candidate != null &&
                    candidate <= (long) nums[i] + valueDiff) {
                return true;
            }

            set.add((long) nums[i]);

            if (set.size() > indexDiff) {
                set.remove((long) nums[i - indexDiff]);
            }
        }

        return false;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,1};
        int indexDiff = 3;
        int valueDiff = 0;
        System.out.println(new ContainsDuplicateSlidingWindowTreeSet().containsNearbyAlmostDuplicate(nums, indexDiff, valueDiff));
    }
}
