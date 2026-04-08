package leetcode.duplicateNumber_287;

public class DuplicateNumber {
    private int findDuplicate(int[] nums) {
        int low = 1;
        int high = nums.length - 1;

        while (low < high) {
            int mid = low + (high - low) / 2;
            int count = 0;
            for (int num : nums) {
                if (num <= mid){
                    count++;
                }
            }

            if (count > mid) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }
    public static void main(String[] args) {
        DuplicateNumber obj = new DuplicateNumber();

        int[] nums1 = {1, 3, 4, 2, 2};
        int[] nums2 = {3, 1, 3, 4, 2};

        System.out.println("Duplicate in nums1: " + obj.findDuplicate(nums1));
        System.out.println("Duplicate in nums2: " + obj.findDuplicate(nums2));
    }

}
