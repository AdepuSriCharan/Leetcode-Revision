package leetcode.sortedArrayMedian_4;

public class SortedArrayMedian_MergeApproach {
    private static double sortedArrayMedian(int[] nums1, int[] nums2){
        int left = nums1.length;
        int right = nums2.length;
        int i = 0, j = 0, k = 0;

        int total = nums1.length + nums2.length;
        int[] res = new int[total];

        while (i < left && j < right){
            if (nums1[i] < nums2[j]){
                res[k++] = nums1[i++];
            } else {
                res[k++] = nums2[j++];
            }
        }

        while (i < left){
            res[k++] = nums1[i++];
        }

        while (j < right){
            res[k++] = nums2[j++];
        }

        if (total % 2 == 0){
            return (res[total / 2 - 1] + res[total / 2]) / 2.0;
        }
        return res[total / 2];
    }
    public static void main(String[] args) {
        int[] nums1 = {1,2,3, 10, 11, 28};
        int[] nums2 = {4,5,6,7};
        System.out.println(sortedArrayMedian(nums1, nums2));
    }
}
