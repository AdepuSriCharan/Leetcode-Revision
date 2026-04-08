package leetcode.duplicateNumber_287;

public class DuplicateFloydsCycle {
    private static int findDuplicate(int[] nums) {

        int slow = nums[0];
        int fast = nums[0];

        do {
            slow = nums[slow];
            fast = nums[nums[fast]];
        } while (slow != fast);

        slow = nums[0];
        while (slow != fast) {
            slow = nums[slow];
            fast = nums[fast];
        }
        return slow;
    }
    public static void main(String[] args) {
        DuplicateNumber obj = new DuplicateNumber();

        int[] nums1 = {1, 3, 4, 2, 2};
        int[] nums2 = {3, 1, 3, 4, 2};

        System.out.println("Duplicate in nums1: " + findDuplicate(nums1));
        System.out.println("Duplicate in nums2: " + findDuplicate(nums2));
    }
}
