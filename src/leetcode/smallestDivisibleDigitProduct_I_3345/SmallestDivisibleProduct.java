package leetcode.smallestDivisibleDigitProduct_I_3345;

public class SmallestDivisibleProduct {
    public int smallestNumber(int n, int t) {

        while (true) {
            if (product(n, t))
                return n;
            n++;
        }
    }

    private boolean product(int num, int t) {
        int prod = 1;

        while (num > 0) {
            int d = num % 10;

            if (d == 0)
                return true;

            prod *= d;
            num /= 10;
        }

        return prod % t == 0;
    }

    public static void main(String[] args) {
        int n = 3;
        int t = 2;
        System.out.println(new SmallestDivisibleProduct().smallestNumber(n, t));
    }
}
