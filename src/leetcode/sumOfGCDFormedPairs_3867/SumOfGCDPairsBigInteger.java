package leetcode.sumOfGCDFormedPairs_3867;

import java.math.BigInteger;
import java.util.Arrays;

public class SumOfGCDPairsBigInteger {
    private long gcdSum(int[] nums) {

        int n = nums.length;
        int[] arr = new int[n];

        int max = 0;

        for (int i = 0; i < n; i++) {
            max = Math.max(max, nums[i]);
            arr[i] = gcd(nums[i], max);
        }

        Arrays.sort(arr);

        long ans = 0;

        for (int i = 0; i < n / 2; i++) {
            ans += gcd(arr[i], arr[n - 1 - i]);
        }

        return ans;
    }

    private int gcd(int a, int b) {
        return BigInteger.valueOf(a)
                .gcd(BigInteger.valueOf(b))
                .intValue();
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5};
        System.out.println(new SumOfGCDPairsBigInteger().gcdSum(nums));
    }
}
