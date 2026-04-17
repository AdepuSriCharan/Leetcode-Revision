package leetcode.findPeakElement_162;

public class FindPeakElementLinear {
    private static int findPeakElementLinear(int[] nums) {
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            boolean left = (i == 0) || (nums[i] > nums[i - 1]);
            boolean right = (i == n - 1) || (nums[i] > nums[i + 1]);

            if (left && right) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 1};
        int[] nums2 = {1, 2, 1, 3, 5, 6, 4};

        System.out.println("Linear:");
        System.out.println(findPeakElementLinear(nums1));
        System.out.println(findPeakElementLinear(nums2));
    }
}
