package leetcode.heaters_475;

import java.util.Arrays;

public class HeatersTwoPointers {
    public int findRadius(int[] houses, int[] heaters) {

        Arrays.sort(houses);
        Arrays.sort(heaters);

        int j = 0;
        int ans = 0;

        for (int house : houses) {

            while (j < heaters.length - 1 && Math.abs(heaters[j + 1] - house) <= Math.abs(heaters[j] - house)) {
                j++;
            }

            ans = Math.max(ans, Math.abs(heaters[j] - house));
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] houses = {1,2,3};
        int[] heaters = {2};
        System.out.println(new HeatersTwoPointers().findRadius(houses, heaters));
    }
}
