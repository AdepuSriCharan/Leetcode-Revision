package leetcode.minimumSwapsMoveZeros_3936;

public class MinSwapsToMoveZerosEnd {
    public int minimumSwaps(int[] nums) {
        int k = nums.length - 1;

        int count = 0;

        for (int i = 0; i < k; i++) {

            while (i < k && nums[k] == 0) {
                k--;
            }

            if (i < k && nums[i] == 0) {
                int temp = nums[i];
                nums[i] = nums[k];
                nums[k] = temp;
                count++;
                k--;
            }
        }

        return count;
    }
}
