package leetcode.increasingTripletSubsequence_334;

public class IncreasingTripletBruteForce {
    private static boolean increasingTriplet(int[] nums) {
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int k = j + 1; k < n; k++) {
                    if (nums[i] < nums[j] && nums[j] < nums[k]) {
                        return true;
                    }
                }
            }
        }

        return false;
    }
    public static void main(String[] args) {

        int[] nums1 = {1, 2, 3, 4, 5};
        int[] nums2 = {5, 4, 3, 2, 1};
        int[] nums3 = {2, 1, 5, 0, 4, 6};

        System.out.println("Test Case 1: " + increasingTriplet(nums1));
        System.out.println("Test Case 2: " + increasingTriplet(nums2));
        System.out.println("Test Case 3: " + increasingTriplet(nums3));
    }
}
