package leetcode.maxArea_11;

import static java.lang.Integer.min;

public class MaxAreaBruteForce {
    public static void main(String[] args) {
        int[] nums = {1,8,6,2,5,4,8,3,7};
        int result = maxAreaBruteForce(nums);
        System.out.println(result);
    }

    private static int maxAreaBruteForce(int[] nums) {
        int max = 0;
        for (int i = 0; i < nums.length; i++){
            for (int j = i + 1; j < nums.length ; j++) {
                int area = min(nums[i], nums[j]) * (j - 1);

                max = Integer.max(max, area);
            }
        }
        return max;
    }
}
