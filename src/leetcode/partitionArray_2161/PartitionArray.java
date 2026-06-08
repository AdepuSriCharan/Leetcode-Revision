package leetcode.partitionArray_2161;

import java.util.Arrays;

public class PartitionArray {
    public int[] pivotArray(int[] nums, int pivot) {
        int[] result = new int[nums.length];
        int index = 0;
        for (int num : nums) {
            if (num < pivot) {
                result[index++] = num;
            }
        }
        for (int num : nums) {
            if (num == pivot) {
                result[index++] = num;
            }
        }

        for (int num : nums) {
            if (num > pivot) {
                result[index++] = num;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int pivot = 5;
        PartitionArray obj = new PartitionArray();
        int[] result = obj.pivotArray(nums, pivot);
        System.out.println(Arrays.toString(result));
    }
}
