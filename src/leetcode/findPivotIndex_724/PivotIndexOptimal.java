package leetcode.findPivotIndex_724;

public class PivotIndexOptimal {
    private static int pivotIndex(int[] nums) {
        int total = 0;
        for (int num : nums) {
            total += num;
        }

        int leftTotal = 0;
        for (int i = 0; i < nums.length; i++) {
            int rightTotal = total - leftTotal - nums[i];
            if (rightTotal == leftTotal) {
                return i;
            }
            leftTotal += nums[i];
        }

        return -1;
    }
    public static void main(String[] args) {
        int[] nums = {1, 7, 3, 6, 5, 6};
        System.out.println(pivotIndex(nums));
    }
}
