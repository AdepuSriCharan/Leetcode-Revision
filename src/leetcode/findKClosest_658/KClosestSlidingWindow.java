package leetcode.findKClosest_658;

import java.util.ArrayList;
import java.util.List;

public class KClosestSlidingWindow {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {

        int left = 0;
        int right = arr.length - 1;

        while (right - left + 1 > k) {

            if (x - arr[left] <= arr[right] - x) {
                right--;
            } else {
                left++;
            }
        }

        List<Integer> res = new ArrayList<>();

        for (int i = left; i <= right; i++) {
            res.add(arr[i]);
        }

        return res;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int k = 4;
        int x = 3;
        System.out.println(new KClosestSlidingWindow().findClosestElements(arr, k, x));
    }
}
