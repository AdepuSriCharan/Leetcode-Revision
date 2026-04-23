package leetcode.firstMatchingChar_3884;

public class FirstMatchingCharStringRev {
    private static int firstMatchingIndex(String s) {
        String reversed = new StringBuilder(s).reverse().toString();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == reversed.charAt(i)) {
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
