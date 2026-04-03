package leetcode.searchInRotatedSortedArray_33;

public class RotatedArrayBinarySearch {
    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while (left <= right){
            int mid = left + (right - left) / 2;

            if (nums[mid] == target){
                return mid;
            }

            if (nums[left] <= nums[mid]) {
                if (nums[left] <= target && target < nums[mid]) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            }

            else {
                if (nums[mid] < target && target <= nums[right]) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        RotatedArrayBinarySearch obj = new RotatedArrayBinarySearch();

        int[] nums1 = {4,5,6,7,0,1,2};
        int target1 = 0;
        int result1 = obj.search(nums1, target1);
        System.out.println("Result 1: " + result1);

        int[] nums2 = {4,5,6,7,0,1,2};
        int target2 = 3;
        int result2 = obj.search(nums2, target2);
        System.out.println("Result 2: " + result2);

        int[] nums3 = {1};
        int target3 = 0;
        int result3 = obj.search(nums3, target3);
        System.out.println("Result 3: " + result3);
    }
}
