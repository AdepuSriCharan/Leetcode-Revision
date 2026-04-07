package leetcode.pow_50;

public class PowerDivideConquer {
    private static double myPow(double x, int n) {
        long N = n;

        if (N < 0) {
            return 1 / power(x, -N);
        }
        return power(x, N);
    }

    private static double power(double x, long n) {
        if (n == 0)
            return 1;

        double half = power(x, n / 2);

        if (n % 2 == 0) {
            return half * half;
        } else {
            return half * half * x;
        }
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
