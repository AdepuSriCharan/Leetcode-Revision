package leetcode.findPivotIndex_724;

public class PivotIndexPrefix {
    public static int pivotIndex(int[] nums) {
        int n = nums.length;
        int[] prefix = new int[n];

        prefix[0] = nums[0];

        for (int i = 1; i < n; i++) {
            prefix[i] = prefix[i - 1] + nums[i];
        }

        for (int i = 0; i < n; i++) {
            int leftSum = (i == 0) ? 0 : prefix[i - 1];
            int rightSum = prefix[n - 1] - prefix[i];

            if (leftSum == rightSum) {
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        System.out.println(pivotIndex(nums));
    }
}