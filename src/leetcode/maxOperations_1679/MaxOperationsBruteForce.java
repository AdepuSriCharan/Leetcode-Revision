package leetcode.maxOperations_1679;

public class MaxOperationsBruteForce {
    public static int maxOperations(int[] nums, int k) {
        int n = nums.length;
        boolean[] used = new boolean[n];
        int count = 0;

        for (int i = 0; i < n; i++) {
            if (used[i])
                continue;

            for (int j = i + 1; j < n; j++) {
                if (!used[j] && nums[i] + nums[j] == k) {
                    used[i] = true;
                    used[j] = true;
                    count++;
                    break;
                }
            }
        }

        return count;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        int k = 5;

        System.out.println(maxOperations(nums, k));
    }
}
