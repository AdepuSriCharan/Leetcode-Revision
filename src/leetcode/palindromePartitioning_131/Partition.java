package leetcode.palindromePartitioning_131;

import java.util.ArrayList;
import java.util.List;

public class Partition {
    private static List<List<String>> partition(String s) {
        List<List<String>> result = new ArrayList<>();
        backtrack(0, s, new ArrayList<>(), result);
        return result;
    }

    private static void backtrack(int start, String s, List<String> path, List<List<String>> result) {
        if (start == s.length()) {
            result.add(new ArrayList<>(path));
            return;
        }

        for (int end = start; end < s.length(); end++){
            if (isPalindrome(s, start, end)) {
                path.add(s.substring(start, end + 1));
                backtrack(end + 1, s, path, result);
                path.remove(path.size() - 1);
            }
        }
    }

    private static boolean isPalindrome(String s, int left, int right) {
        while (left < right) {
            if (s.charAt(left++) != s.charAt(right--)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "aab";

        List<List<String>> result = partition(s);

        for (List<String> list : result) {
            System.out.println(list);
        }
    }
}
