package leetcode.validAnagram_242;

import java.util.Arrays;

/*
Time Complexity: O(n log n)
Space Complexity: O(n)
*/
public class ValidAnagramSorting {
    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()){
            return false;
        }
        char[] str1 = s.toCharArray();
        char[] str2 = t.toCharArray();

        Arrays.sort(str1);
        Arrays.sort(str2);

        return Arrays.equals(str1, str2);
    }

    public static void main(String[] args) {
        String s = "anagramsasaq";
        String t = "nagaramasas";
        System.out.println(isAnagram(s, t));
    }
}
