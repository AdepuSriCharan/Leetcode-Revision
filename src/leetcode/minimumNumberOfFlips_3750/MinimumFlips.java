package leetcode.minimumNumberOfFlips_3750;

public class MinimumFlips {
    private static int minFlips(int n) {

        String s = Integer.toBinaryString(n);
        String rev = new StringBuilder(s).reverse().toString();
        int flips = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != rev.charAt(i)) {
                flips++;
            }
        }

        return flips;
    }
    public static void main(String[] args) {
        System.out.println(minFlips(7));
        System.out.println(minFlips(10));
    }
}
