package leetcode.asteroidCollision_735;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AsteroidCollisionList {
    public static int[] asteroidCollision(int[] asteroids) {
        List<Integer> list = new ArrayList<>();

        for (int a : asteroids) {
            boolean destroyed = false;

            while (!list.isEmpty() && a < 0 && list.get(list.size() - 1) > 0) {
                int last = list.get(list.size() - 1);

                if (last < -a) {
                    list.remove(list.size() - 1);
                } else if (last == -a) {
                    list.remove(list.size() - 1);
                    destroyed = true;
                    break;
                } else {
                    destroyed = true;
                    break;
                }
            }

            if (!destroyed) {
                list.add(a);
            }
        }

        int[] res = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            res[i] = list.get(i);
        }

        return res;
    }

    public static void main(String[] args) {
        int[] asteroids = {5, 10, -5};
        System.out.println(Arrays.toString(asteroidCollision(asteroids)));
    }
}
