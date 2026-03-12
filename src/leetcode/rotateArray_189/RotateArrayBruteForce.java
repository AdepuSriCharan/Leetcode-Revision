package leetcode.rotateArray_189;

import java.util.Arrays;

public class RotateArrayBruteForce {

    public static void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n;
        for (int step = 0; step < k; step++){
            int last = nums[n - 1];
            for (int i = n - 1; i > 0; i--){
                nums[i] = nums[i - 1];
            }
            nums[0] = last;
        }
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7};
        int k = 3;
        rotate(nums, k);
        System.out.println(Arrays.toString(nums));
    }
}