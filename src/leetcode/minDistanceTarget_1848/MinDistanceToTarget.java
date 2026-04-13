package leetcode.minDistanceTarget_1848;

public class MinDistanceToTarget {
    private static int getMinDistance(int[] nums, int target, int start) {
        int minDistance = Integer.MAX_VALUE;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                int distance = Math.abs(i - start);
                minDistance = Math.min(minDistance, distance);
            }
        }

        return minDistance;
    }
    public static void main(String[] args) {

        int[] nums1 = {1, 2, 3, 4, 5};
        int target1 = 5;
        int start1 = 3;

        int result1 = getMinDistance(nums1, target1, start1);
        System.out.println("Output 1: " + result1);

        int[] nums2 = {1};
        int target2 = 1;
        int start2 = 0;

        int result2 = getMinDistance(nums2, target2, start2);
        System.out.println("Output 2: " + result2);

        int[] nums3 = {1,1,1,1,1,1,1,1,1,1};
        int target3 = 1;
        int start3 = 0;

        int result3 = getMinDistance(nums3, target3, start3);
        System.out.println("Output 3: " + result3);
    }
}
