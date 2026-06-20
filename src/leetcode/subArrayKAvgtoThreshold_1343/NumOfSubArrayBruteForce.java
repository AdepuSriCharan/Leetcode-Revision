package leetcode.subArrayKAvgtoThreshold_1343;

public class NumOfSubArrayBruteForce {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int count = 0;

        for (int i = 0; i <= arr.length - k; i++) {
            int sum = 0;

            for (int j = i; j < i + k; j++) {
                sum += arr[j];
            }

            if (sum >= k * threshold) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        int[] arr = {2,2,2,2,5,5,5,8};
        int k = 3;
        int threshold = 4;
        System.out.println(new NumOfSubArrayBruteForce().numOfSubarrays(arr, k, threshold));
    }
}
