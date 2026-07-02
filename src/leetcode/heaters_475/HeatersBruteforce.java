package leetcode.heaters_475;

import java.util.Arrays;

public class HeatersBruteforce {
    public int findRadius(int[] houses, int[] heaters) {

        Arrays.sort(heaters);

        int ans = 0;

        for (int house : houses) {

            int idx = Arrays.binarySearch(heaters, house);

            if (idx >= 0){
                continue;
            }

            idx = -(idx + 1);

            int left = Integer.MAX_VALUE;
            int right = Integer.MAX_VALUE;

            if (idx > 0)
                left = house - heaters[idx - 1];

            if (idx < heaters.length)
                right = heaters[idx] - house;

            ans = Math.max(ans, Math.min(left, right));
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] houses = {1,2,3};
        int[] heaters = {2};
        System.out.println(new HeatersBruteforce().findRadius(houses, heaters));
    }
}
