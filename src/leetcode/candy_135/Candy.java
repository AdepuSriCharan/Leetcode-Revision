package leetcode.candy_135;

import java.util.Arrays;

public class Candy {
    public static int candy(int[] ratings) {
        int[] candies = new int[ratings.length];

        Arrays.fill(candies, 1);

        for (int left = 1; left < ratings.length; left++) {
            if (ratings[left] > ratings[left - 1]){
                candies[left] = candies[left - 1] + 1;
            }
        }

        for (int right = ratings.length - 1; right > 0; right--) {
            if (ratings[right - 1] > ratings[right] && candies[right - 1] <= candies[right]) {
                candies[right - 1] = candies[right] + 1;
            }
        }
        int totalCandies = 0;
        for (int candy : candies) {
            totalCandies += candy;
        }
        return totalCandies;
    }
    public static void main(String[] args) {
        int[] nums = {1,2,3,1};
        int result = candy(nums);
        System.out.println("Min candies: " + result);
    }
}
