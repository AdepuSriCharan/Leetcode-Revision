package leetcode.removeElement_27;

public class RemoveElementTwoPointerFront {
    public static int removeElement(int[] nums, int val){
        int k = 1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val){
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }
    public static void main(String[] args) {
        int[] nums = {3, 2, 2, 3, 4};
        int val = 3;
        int newLength = removeElement(nums, val);

        for (int i = 0; i < newLength; ++i) {
            System.out.print(nums[i] + " ");
        }
    }
}
