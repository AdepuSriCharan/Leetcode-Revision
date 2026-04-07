package leetcode.pow_50;

public class PowerBruteForce {
    private static double myPow(double x, int n) {
        long N = n;
        if (N < 0) {
            x = 1 / x;
            N = -N;
        }
        double result = 1.0;
        for (int i = 0; i < N; i++){
            result *= x;
        }

        return result;
    }
    public static void main(String[] args) {
        double x1 = 2.0;
        int n1 = 10;

        double x2 = 2.1;
        int n2 = 3;

        double x3 = 2.0;
        int n3 = -2;

        System.out.println(myPow(x1, n1));
        System.out.println(myPow(x2, n2));
        System.out.println(myPow(x3, n3));
    }
}
