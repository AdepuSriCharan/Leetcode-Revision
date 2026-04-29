package leetcode.minimumNumberOfFlips_3750;

public class MinimumFlipsTwoPointer {

    private static int minFlips(int n) {
        String s = Integer.toBinaryString(n);
        int i = 0, j = s.length() - 1, flips = 0;

        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) {
                flips += 2;
            }
            i++;
            j--;
        }

        return flips;
    }

    public static void main(String[] args) {
        System.out.println(minFlips(7));
        System.out.println(minFlips(10));
    }
}
