package leetcode.anagramsInAString_438;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FIndAnagramsBruteForce {
    private static List<Integer> findAnagrams(String s, String p) {
        List<Integer> result = new ArrayList<>();
        int k = p.length();

        char[] pArr = p.toCharArray();
        Arrays.sort(pArr);

        for (int i = 0; i <= s.length() - k; i++) {
            char[] temp = s.substring(i, i + k).toCharArray();
            Arrays.sort(temp);

            if (Arrays.equals(temp, pArr)) {
                result.add(i);
            }
        }

        return result;
    }
    public static void main(String[] args) {
        String s1 = "cbaebabacd";
        String p1 = "abc";
        System.out.println(findAnagrams(s1, p1));

        String s2 = "abab";
        String p2 = "ab";
        System.out.println(findAnagrams(s2, p2));
    }
}
