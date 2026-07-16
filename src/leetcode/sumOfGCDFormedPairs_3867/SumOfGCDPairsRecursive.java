package leetcode.sumOfGCDFormedPairs_3867;

import java.util.Arrays;

public class SumOfGCDPairsRecursive {
    private long gcdSum(int[] nums) {
        int n = nums.length;
        int[] prefixGcd = new int[n];

        int max = 0;
        for (int i = 0; i < n; i++) {
            max = Math.max(max, nums[i]);
            prefixGcd[i] = gcd(nums[i], max);
        }

        Arrays.sort(prefixGcd);

        long ans = 0;

        for (int i = 0; i < n / 2; i++) {
            ans += gcd(prefixGcd[i], prefixGcd[n - 1 - i]);
        }

        return ans;
    }

    private int gcd(int a, int b) {
        if (b == 0)
            return a;
        return gcd(b, a % b);
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};
        System.out.println(new SumOfGCDPairsRecursive().gcdSum(nums));
    }
}
