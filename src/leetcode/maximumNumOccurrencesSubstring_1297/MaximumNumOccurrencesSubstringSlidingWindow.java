package leetcode.maximumNumOccurrencesSubstring_1297;

import java.util.HashMap;
import java.util.Map;

public class MaximumNumOccurrencesSubstringSlidingWindow {
    public int maxFreq(String s, int maxLetters, int minSize, int maxSize) {
        Map<String, Integer> map = new HashMap<>();

        int[] freq = new int[26];
        int unique = 0;
        int left = 0;
        int ans = 0;

        for (int right = 0; right < s.length(); right++) {
            int add = s.charAt(right) - 'a';

            if (freq[add] == 0) unique++;
            freq[add]++;

            if (right - left + 1 > minSize) {
                int rem = s.charAt(left) - 'a';
                freq[rem]--;

                if (freq[rem] == 0) unique--;
                left++;
            }

            if (right - left + 1 == minSize && unique <= maxLetters) {
                String sub = s.substring(left, right + 1);

                int cnt = map.getOrDefault(sub, 0) + 1;
                map.put(sub, cnt);

                ans = Math.max(ans, cnt);
            }
        }

        return ans;
    }
    public static void main(String[] args) {
        MaximumNumOccurrencesSubstringSlidingWindow solution =
                new MaximumNumOccurrencesSubstringSlidingWindow();
        System.out.println(solution.maxFreq("abacabad", 2, 3, 5));
    }
}
