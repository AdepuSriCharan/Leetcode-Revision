package leetcode.largestNumber_179;

import java.util.Arrays;

public class LargestNumberSorting {
    public String largestNumber(int[] nums) {

        String[] arr = new String[nums.length];

        for (int i = 0; i < nums.length; i++)
            arr[i] = String.valueOf(nums[i]);

        Arrays.sort(arr, (a, b) -> (b + a).compareTo(a + b));

        if (arr[0].equals("0"))
            return "0";

        StringBuilder ans = new StringBuilder();

        for (String s : arr)
            ans.append(s);

        return ans.toString();
    }
    public static void main(String[] args) {
        LargestNumberSorting solution = new LargestNumberSorting();
        System.out.println(solution.largestNumber(new int[]{10,2}));
    }
}
