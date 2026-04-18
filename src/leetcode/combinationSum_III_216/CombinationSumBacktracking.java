package leetcode.combinationSum_III_216;

import java.util.ArrayList;
import java.util.List;

public class CombinationSumBacktracking {
    public static List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(1, k, n, new ArrayList<>(), result);
        return result;
    }

    private static void backtrack(int start, int k, int remaining, List<Integer> current, List<List<Integer>> result) {

        if (k == 0 && remaining == 0) {
            result.add(new ArrayList<>(current));
            return;
        }

        if (k == 0 || remaining < 0){
            return;
        }

        for (int i = start; i <= 9; i++) {
            if (i > remaining)
                break;

            current.add(i);
            backtrack(i + 1, k - 1, remaining - i, current, result);
            current.remove(current.size() - 1);
        }
    }
    public static void main(String[] args) {
        int k = 3, n = 9;
        System.out.println(combinationSum3(k, n));
    }
}
