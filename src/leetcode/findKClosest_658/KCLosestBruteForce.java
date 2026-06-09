package leetcode.findKClosest_658;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class KCLosestBruteForce {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {

        List<Integer> list = new ArrayList<>();

        for (int num : arr) {
            list.add(num);
        }

        Collections.sort(list, (a, b) -> {
            int diff1 = Math.abs(a - x);
            int diff2 = Math.abs(b - x);

            if (diff1 == diff2) {
                return a - b;
            }

            return diff1 - diff2;
        });

        list = list.subList(0, k);

        Collections.sort(list);

        return list;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int k = 4;
        int x = 3;
        KCLosestBruteForce obj = new KCLosestBruteForce();
        List<Integer> result = obj.findClosestElements(arr, k, x);
        System.out.println(result);
    }
}
