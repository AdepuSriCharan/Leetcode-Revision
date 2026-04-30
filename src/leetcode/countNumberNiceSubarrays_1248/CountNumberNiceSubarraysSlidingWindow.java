package leetcode.countNumberNiceSubarrays_1248;

public class CountNumberNiceSubarraysSlidingWindow {
    private static int numberOfSubarrays(int[] nums, int k) {
        return atMost(nums, k) - atMost(nums, k - 1);
    }

    private static int atMost(int[] nums, int k) {
        int left = 0;
        int count = 0;
        int oddCount = 0;

        for (int right = 0; right < nums.length; right++) {

            if (nums[right] % 2 == 1) {
                oddCount++;
            }

            while (oddCount > k) {
                if (nums[left] % 2 == 1) {
                    oddCount--;
                }
                left++;
            }

            count += (right - left + 1);
        }

        return count;
    }
    public static void main(String[] args) {

        int[] nums1 = {1, 1, 2, 1, 1};
        int k1 = 3;
        System.out.println("Output 1: " + numberOfSubarrays(nums1, k1));

        int[] nums2 = {2, 4, 6};
        int k2 = 1;
        System.out.println("Output 2: " + numberOfSubarrays(nums2, k2));

        int[] nums3 = {2,2,2,1,2,2,1,2,2,2};
        int k3 = 2;
        System.out.println("Output 3: " + numberOfSubarrays(nums3, k3));
    }
}
