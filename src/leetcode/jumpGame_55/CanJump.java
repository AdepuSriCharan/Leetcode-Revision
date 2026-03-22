package leetcode.jumpGame_55;

public class CanJump {
    private static boolean canJump(int[] nums) {
        int maxReach = 0;

        for (int i = 0; i < nums.length; i++) {
            if (i > maxReach) {
                return false;
            }

            maxReach = Math.max(maxReach, i + nums[i]);
        }

        return true;
    }

    public static void main(String[] args) {

        int[] nums1 = {2, 3, 1, 1, 4};
        int[] nums2 = {3, 2, 1, 0, 4};

        System.out.println("Example 1: " + canJump(nums1));
        System.out.println("Example 2: " + canJump(nums2));
    }
}
