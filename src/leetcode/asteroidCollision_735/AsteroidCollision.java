package leetcode.asteroidCollision_735;

import java.util.Arrays;

public class AsteroidCollision {
    private static int[] asteroidCollision(int[] asteroids) {
        int[] res = new int[asteroids.length];
        int top = -1;

        for (int a : asteroids){
            boolean destroyed = false;

            while (top >= 0 && a < 0 && res[top] > 0){
                if (res[top] < -a) {
                    top--;
                } else if (res[top] == -a) {
                    top--;
                    destroyed = true;
                    break;
                } else {
                    destroyed = true;
                    break;
                }
            }

            if (!destroyed) {
                res[++top] = a;
            }
        }

        return Arrays.copyOf(res, top + 1);
    }

    public static void main(String[] args) {
        int[] asteroids = {10, 2, -5};
        System.out.println(Arrays.toString(asteroidCollision(asteroids)));
    }
}
