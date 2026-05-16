package leetcode.minimumRotatedSortedArray_II_154;

public class FindMinRotatedSortedArray_II {
    private static int findMin(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        while(left < right){
            int mid = left + (right - left) / 2;
            if(nums[mid] > nums[right]){
                left = mid + 1;
            }
            else if(nums[mid] < nums[right]){
                right = mid;
            }
            else{
                right--;
            }
        }

        return nums[left];
    }
    public static void main(String[] args) {

        int[] nums1 = {1,3,5};
        int[] nums2 = {2,2,2,0,1};
        int[] nums3 = {11, 13, 15, 17};

        System.out.println(findMin(nums1));
        System.out.println(findMin(nums2));
        System.out.println(findMin(nums3));
    }
}
