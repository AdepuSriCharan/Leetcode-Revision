package leetcode.removeMinMaxArray_2091;

public class RemoveMinMaxArray {
    public int minimumDeletions(int[] nums) {
        int min = nums[0], max = nums[0], minIndex = 0, maxIndex = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < min) {
                min = nums[i];
                minIndex = i;
            }

            if (nums[i] > max) {
                max = nums[i];
                maxIndex = i;
            }
        }

        int left = Math.min(minIndex, maxIndex);
        int right = Math.max(minIndex, maxIndex);

        int front = right + 1;
        int back = nums.length - left;
        int both = left + 1 + nums.length - right;

        return Math.min(front, Math.min(back, both));
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};
        System.out.println(new RemoveMinMaxArray().minimumDeletions(nums));
    }
}
