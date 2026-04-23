package leetcode.firstMatchingChar_3884;

public class FirstMatchingCharTwoPointer {
    public static int firstMatchingIndex(String s) {
        int n = s.length();

        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == s.charAt(n - i - 1)) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(firstMatchingIndex("abcacbd"));
        System.out.println(firstMatchingIndex("abc"));
        System.out.println(firstMatchingIndex("abcdab"));
    }
}