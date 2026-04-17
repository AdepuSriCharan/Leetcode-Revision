package leetcode.findPeakElement_162;

public class findPeakElementTwoPointer {
    private static int findPeakElementTwoPointer(int[] nums) {
        int left = 0, right = nums.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] < nums[mid + 1]) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return left;
    }
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 1};
        int[] nums2 = {1, 2, 1, 3, 5, 6, 4};

        System.out.println("Linear:");
        System.out.println(findPeakElementTwoPointer(nums1));
        System.out.println(findPeakElementTwoPointer(nums2));
    }
}
