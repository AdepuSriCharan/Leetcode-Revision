package leetcode.defuseBomb_1652;

public class DefuseBombSlidingWindow {
    public int[] decrypt(int[] code, int k) {
        int n = code.length;
        int[] result = new int[n];

        if (k == 0) {
            return result;
        }

        int start = k > 0 ? 1 : n + k;
        int end = k > 0 ? k : n - 1;

        int sum = 0;
        for (int i = start; i <= end; i++) {
            sum += code[i % n];
        }

        for (int i = 0; i < n; i++) {
            result[i] = sum;
            sum -= code[start % n];
            start++;
            end++;
            sum += code[end % n];
        }

        return result;
    }

    public static void main(String[] args) {
        int[] code = {5,7,1,4};
        int k = 3;

    }
}
