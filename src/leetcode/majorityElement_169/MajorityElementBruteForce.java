package leetcode.majorityElement_169;

public class MajorityElementBruteForce {

    public static void main(String[] args) {
        int[] nums = {2, 2, 1, 1, 1, 2, 2};
        int result = majorityElement(nums);
        System.out.println(result);
    }

    private static int majorityElement(int[] nums) {
        int major = nums.length/2;
        int count;

        for (int i : nums){
            count = 0;
            for (int j : nums){
                if (i == j){
                    count++;
                }
                if (count > major){
                    return i;
                }
            }
        }
        return -1;
    }
}
