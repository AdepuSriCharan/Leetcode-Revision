package leetcode.removeDuplicatesSortedArrayII_80;

public class RemoveDuplicatesSortedArrayII_80 {
    public int removeDuplicates(int[] nums) {
        int k = 2;
        for (int i = 2; i < nums.length; i++){
            if(nums[i] != nums[k - 2]){
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }

    public static void main(String[] args) {

        RemoveDuplicatesSortedArrayII_80 r = new RemoveDuplicatesSortedArrayII_80();

        int[] nums = {0,0,1,1,1,1,2,3,3};
        int newLength = r.removeDuplicates(nums);

        for (int i = 0; i < newLength; ++i) {
            System.out.print(nums[i] + " ");
        }
    }
}
