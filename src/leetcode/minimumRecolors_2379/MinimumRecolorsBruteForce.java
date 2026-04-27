package leetcode.minimumRecolors_2379;

public class MinimumRecolorsBruteForce {
    private static int minimumRecolors(String blocks, int k) {
        int n = blocks.length();
        int minOps = Integer.MAX_VALUE;

        for (int i = 0; i <= n - k; i++) {
            int countW = 0;

            for (int j = i; j < i + k; j++) {
                if (blocks.charAt(j) == 'W') {
                    countW++;
                }
            }

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
