package leetcode.increasingTripletSubsequence_334;

public class IncreasingTripletGreedy {
    private boolean increasingTriplet(int[] nums) {
        int first = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;

        for (int num : nums) {
            if (num <= first){
                first = num;
            }
            else if (num <= second){
                second = num;
            }
            else {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        IncreasingTripletGreedy obj = new IncreasingTripletGreedy();

        int[] nums1 = {1, 2, 3, 4, 5};
        int[] nums2 = {5, 4, 3, 2, 1};
        int[] nums3 = {2, 1, 5, 0, 4, 6};

        System.out.println("Test Case 1: " + obj.increasingTriplet(nums1));
        System.out.println("Test Case 2: " + obj.increasingTriplet(nums2));
        System.out.println("Test Case 3: " + obj.increasingTriplet(nums3));
    }
}
