package leetcode.powerOfThree_326;

public class PowerOfThreeDivision {
    private static boolean isPowerOfThree(int n) {
        if (n <= 0){
            return false;
        }

        while (n % 3 == 0) {
            n = n/3;
        }

        return n == 1;
    }

    public static void main(String[] args) {
        System.out.println(isPowerOfThree(27));
        System.out.println(isPowerOfThree(0));
        System.out.println(isPowerOfThree(-1));
    }
}
