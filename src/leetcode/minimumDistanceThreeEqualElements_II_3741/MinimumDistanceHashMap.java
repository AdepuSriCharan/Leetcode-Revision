package leetcode.minimumDistanceThreeEqualElements_II_3741;

import java.util.*;

public class MinimumDistanceHashMap {

    private static int minimumDistance(int[] nums) {
        Map<Integer, List<Integer>> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            map.computeIfAbsent(nums[i], k -> new ArrayList<>()).add(i);
        }

        int min = Integer.MAX_VALUE;

        for (List<Integer> list : map.values()) {
            if (list.size() < 3)
                continue;

            for (int i = 0; i <= list.size() - 3; i++){
                int first = list.get(i);
                int third = list.get(i + 2);

                int distance = 2 * (third - first);
                min = Math.min(min, distance);
            }
        }

        return min == Integer.MAX_VALUE ? -1 : min;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,1,1,3};
        System.out.println(minimumDistance(nums));
    }
}