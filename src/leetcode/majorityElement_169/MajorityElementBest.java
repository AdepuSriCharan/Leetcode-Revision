package leetcode.majorityElement_169;

public class MajorityElementBest {
    public int majorityElement(int[] nums) {
        int candidate = 0;
        int count = 0;
        for (int num : nums){
            if (count == 0){
                candidate = num;
            }
            if (num == candidate){
                count++;
            } else {
                count--;
            }
        }
        return candidate;
    }

    public static void main(String[] args) {
        MajorityElementBest m = new MajorityElementBest();
        int[] nums = {2, 2, 1, 1, 1, 2, 2};
        int result = m.majorityElement(nums);
        System.out.println(result);
    }
}