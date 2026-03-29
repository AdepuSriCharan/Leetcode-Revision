package leetcode.makeStringsEqual_2839;

public class CanBeEqualFrequency {
    public static boolean canBeEqual(String s1, String s2) {
        int[] evenCount = new int[26];
        int[] oddCount  = new int[26];

        evenCount[s1.charAt(0) - 'a']++;
        evenCount[s1.charAt(2) - 'a']++;
        oddCount[s1.charAt(1) - 'a']++;
        oddCount[s1.charAt(3) - 'a']++;

        evenCount[s2.charAt(0) - 'a']--;
        evenCount[s2.charAt(2) - 'a']--;
        oddCount[s2.charAt(1) - 'a']--;
        oddCount[s2.charAt(3) - 'a']--;

        for (int i = 0; i < 26; i++) {
            if (evenCount[i] != 0 || oddCount[i] != 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        String s1 = "abcd";
        String s2 = "cdab";

        System.out.println(canBeEqual(s1, s2));
    }
}
