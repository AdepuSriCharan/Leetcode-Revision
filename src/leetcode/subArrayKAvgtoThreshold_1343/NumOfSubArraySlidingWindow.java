package leetcode.subArrayKAvgtoThreshold_1343;

public class NumOfSubArraySlidingWindow {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int target = k * threshold;
        int sum = 0;
        int count = 0;

        for (int i = 0; i < k; i++) {
            sum += arr[i];
        }

        if (sum >= target) {
            count++;
        }

        for (int i = k; i < arr.length; i++) {
            sum += arr[i] - arr[i - k];

            if (sum >= target) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        int[] arr = {2,2,2,2,5,5,5,8};
        int k = 3;
        int threshold = 4;
        System.out.println(new NumOfSubArraySlidingWindow().numOfSubarrays(arr, k, threshold));
    }
}
