package leetcode.minimumRecolors_2379;

public class MinimumRecolorsSlidingWindow {
    public static int minimumRecolors(String blocks, int k) {
        int n = blocks.length();
        int countW = 0;

        for (int i = 0; i < k; i++) {
            if (blocks.charAt(i) == 'W')
                countW++;
        }

        int minOps = countW;

        for (int i = k; i < n; i++) {
            if (blocks.charAt(i) == 'W')
                countW++;

            if (blocks.charAt(i - k) == 'W')
                countW--;

            minOps = Math.min(minOps, countW);
        }

        return minOps;
    }

    public static void main(String[] args) {
        String blocks = "WBBWWBBWBW";
        int k = 7;
        System.out.println(minimumRecolors(blocks, k));
    }
}
