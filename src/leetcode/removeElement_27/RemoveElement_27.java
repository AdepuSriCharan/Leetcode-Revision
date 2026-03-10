package leetcode.removeElement_27;

public class RemoveElement_27 {
//    public int removeElement(int[] nums, int val) {
//        int result = 0;
//        for (int i = 0; i < nums.length; i++) {
//            if (nums[i] != val) {
//                nums[result] = nums[i];
//                result++;
//            }
//        }
//        return result;
//    }
    public int removeElement(int[] nums, int val) {
        int result = nums.length;
        int i = 0;
        while (i < result){
            if(nums[i] == val){
                nums[i] = nums[--result];
            } else {
                i++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        RemoveElement_27 r = new RemoveElement_27();
        int[] nums = {3, 2, 2, 3, 4};
        int val = 3;
        int newLength = r.removeElement(nums, val);

        for (int i = 0; i < newLength; ++i) {
            System.out.print(nums[i] + " ");
        }
    }
}
