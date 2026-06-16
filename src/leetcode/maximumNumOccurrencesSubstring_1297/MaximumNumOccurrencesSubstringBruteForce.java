package leetcode.maximumNumOccurrencesSubstring_1297;

import java.util.HashMap;
import java.util.Map;

public class MaximumNumOccurrencesSubstringBruteForce {
    public int maxFreq(String s, int maxLetters, int minSize, int maxSize) {
        Map<String, Integer> map = new HashMap<>();
        int ans = 0;

        for (int i = 0; i < s.length(); i++) {
            for (int len = minSize; len <= maxSize && i + len <= s.length(); len++) {
                String sub = s.substring(i, i + len);

                int[] freq = new int[26];
                int unique = 0;

                for (char c : sub.toCharArray()) {
                    if (freq[c - 'a']++ == 0) unique++;
                }

                if (unique <= maxLetters) {
                    int cnt = map.getOrDefault(sub, 0) + 1;
                    map.put(sub, cnt);
                    ans = Math.max(ans, cnt);
                }
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        MaximumNumOccurrencesSubstringBruteForce solution =
                new MaximumNumOccurrencesSubstringBruteForce();
        System.out.println(solution.maxFreq("abacabad", 2, 3, 5));
    }
}
