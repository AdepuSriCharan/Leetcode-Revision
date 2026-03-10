package leetcode.mergedSortedArray_88;

public class MergedSortedArray_88 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1;
        int j = n - 1;
        int k = m + n - 1;

        while (i >= 0 && j >= 0){
            if (nums1[i] > nums2[j]){
                nums1[k] = nums1[i];
                i--;
            } else {
                nums1[k] = nums2[j];
                j--;
            }
            k--;
        }
        while (j >= 0) {
            nums1[k] = nums2[k];
            j--;
            k--;
        }

    }

    public static void main(String[] args) {
        MergedSortedArray_88 m = new MergedSortedArray_88();
        int[] nums1 = {4,5,6,0,0,0};
        int[] nums2 = {1,2,3};
        m.merge(nums1, 3, nums2, 3);
        for (int num : nums1) {
            System.out.print(num + " ");
        }
    }
}
