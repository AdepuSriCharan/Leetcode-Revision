package leetcode.removeDuplicatesSortedArray_26;

public class RemoveDuplicatesSortedArray {
    public int removeDuplicates(int[] nums) {
        int k = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[k - 1]){
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }
    public static void main(String[] args) {
        RemoveDuplicatesSortedArray r = new RemoveDuplicatesSortedArray();
        int[] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int newLength = r.removeDuplicates(nums);

        for (int i = 0; i < newLength; ++i) {
            System.out.print(nums[i] + " ");
        }
    }
}
