package leetcode.smallestDivisibleDigitProduct_I_3345;

public class SmallestDivisibleProductBruteForce {
    public int smallestNumber(int n, int t) {
        while (true) {
            if (digitProduct(n) % t == 0)
                return n;
            n++;
        }
    }

    private int digitProduct(int num) {
        int product = 1;

        while (num > 0) {
            product *= (num % 10);
            num /= 10;
        }

        return product;
    }

    public static void main(String[] args) {
        int n = 3;
        int t = 2;
        System.out.println(new SmallestDivisibleProductBruteForce().smallestNumber(n, t));
    }
}
