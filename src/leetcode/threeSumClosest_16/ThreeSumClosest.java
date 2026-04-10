package leetcode.threeSumClosest_16;

import java.util.Arrays;

public class ThreeSumClosest {
    private int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int resultSum = nums[0] + nums[1] + nums[2];
        int minDiff = Integer.MAX_VALUE;

        for (int i = 0; i < nums.length - 2; i++) {
            int left = i + 1;
            int right = nums.length - 1;

            while (left < right){
                int sum = nums[i] + nums[left] + nums[right];

                if (sum == target){
                    return target;
                }

                int diffToTarget = Math.abs(sum - target);
                if (diffToTarget < minDiff){
                    resultSum = sum;
                    minDiff = diffToTarget;
                }

                if (sum < target) {
                    left++;
                } else {
                    right--;
                }
            }
        }
        return resultSum;
    }

    public static void main(String[] args) {
        ThreeSumClosest obj = new ThreeSumClosest();

        int[] nums = {-1, 2, 1, -4};
        int target = 1;

        int result = obj.threeSumClosest(nums, target);

        System.out.println("Closest sum: " + result);
    }
}
