package leetcode.removeDuplicatesSortedArray_26;

public class RemoveDuplicatesSortedArrayBruteForce {
    public static void main(String[] args) {
        int[] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int newLength = removeDuplicatesBruteForce(nums);
        for (int i = 0; i < newLength; ++i) {
            System.out.print(nums[i] + " ");
        }
    }

    private static int removeDuplicatesBruteForce(int[] nums) {
        int n = nums.length;
        for (int i = 0; i < n - 1; i++) {
            if (nums[i] == nums[i + 1]){
                for (int j = i + 1; j < n - 1; j++) {
                    nums[j] = nums[j + 1];
                }
                n--;
                i--;
            }
        }
        return n;
    }
}
