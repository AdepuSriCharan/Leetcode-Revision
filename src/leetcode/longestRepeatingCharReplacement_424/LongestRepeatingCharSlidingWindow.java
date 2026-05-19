package leetcode.longestRepeatingCharReplacement_424;

import java.util.HashMap;
import java.util.Map;

public class LongestRepeatingCharSlidingWindow {
    private int characterReplacement(String s, int k) {
        int maxFreq = 0, left = 0, maxLength = 0;
        Map<Character, Integer> map = new HashMap<>();
        for (int right = 0; right < s.length(); right++){
            char ch = s.charAt(right);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
            maxFreq = Math.max(maxFreq, map.get(ch));

            int windowSize = right - left + 1;
            if (windowSize - maxFreq > k){
                char charLeft = s.charAt(left);
                map.put(charLeft, map.get(charLeft) - 1);
                left++;
            }
            maxLength = Math.max(maxLength, right - left + 1);
        }
        return maxLength;
    }
    public static void main(String[] args) {

        LongestRepeatingCharSlidingWindow solution =
                new LongestRepeatingCharSlidingWindow();

        String s1 = "ABAB";
        int k1 = 2;

        String s2 = "AABABBA";
        int k2 = 1;

        int result1 = solution.characterReplacement(s1, k1);
        int result2 = solution.characterReplacement(s2, k2);

        System.out.println("Input: " + s1 + ", k = " + k1);
        System.out.println("Output: " + result1);

        System.out.println();

        System.out.println("Input: " + s2 + ", k = " + k2);
        System.out.println("Output: " + result2);
    }
}
