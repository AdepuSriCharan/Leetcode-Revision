package leetcode.assignCookies_455;

import java.util.Arrays;

public class AssignCookiesTwoPointer {
    private static int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);

        int i = 0;
        int j = 0;

        while (i < g.length && j < s.length) {
            if (s[j] >= g[i]) {
                i++;
            }
            j++;
        }

        return i;
    }
    public static void main(String[] args) {

        int[] g1 = {1, 2, 3};
        int[] s1 = {1, 1};
        System.out.println("Output 1: " + findContentChildren(g1, s1));

        int[] g2 = {1, 2};
        int[] s2 = {1, 2, 3};
        System.out.println("Output 2: " + findContentChildren(g2, s2));

        int[] g3 = {2, 3, 4};
        int[] s3 = {1, 2, 3};
        System.out.println("Output 3: " + findContentChildren(g3, s3));
    }
}
