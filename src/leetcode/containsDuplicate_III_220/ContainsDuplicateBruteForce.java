package leetcode.containsDuplicate_III_220;

public class ContainsDuplicateBruteForce {
    private boolean containsNearbyAlmostDuplicate(int[] nums, int indexDiff, int valueDiff) {

        int n = nums.length;

        for (int i = 0; i < n; i++) {

            for (int j = i + 1; j < n; j++) {

                if (j - i <= indexDiff && Math.abs((long) nums[i] - nums[j]) <= valueDiff) {

                    return true;
                }
            }
        }

        return false;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,1};
        int indexDiff = 3;
        int valueDiff = 0;
        System.out.println(new ContainsDuplicateBruteForce().containsNearbyAlmostDuplicate(nums, indexDiff, valueDiff));
    }
}
