package leetcode.findPeakElement_162;

public class FindPeakRecursive {
    private static int findPeakRecursive(int[] nums) {
        return helper(nums, 0, nums.length - 1);
    }

    private static int helper(int[] nums, int left, int right) {
        if (left == right) return left;

        int mid = left + (right - left) / 2;

        if (nums[mid] < nums[mid + 1]) {
            return helper(nums, mid + 1, right);
        } else {
            return helper(nums, left, mid);
        }
    }
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 1};
        int[] nums2 = {1, 2, 1, 3, 5, 6, 4};

        System.out.println("\nRecursive:");
        System.out.println(findPeakRecursive(nums1));
        System.out.println(findPeakRecursive(nums2));
    }
}
