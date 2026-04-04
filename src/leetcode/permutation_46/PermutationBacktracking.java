package leetcode.permutation_46;

import java.util.ArrayList;
import java.util.List;

public class PermutationBacktracking {
    private List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        boolean[] visited = new boolean[nums.length];

        backtrack(nums, result, new ArrayList<>(), visited);
        return result;
    }

    private void backtrack(int[] nums, List<List<Integer>> result, List<Integer> current, boolean[] visited) {

        if (current.size() == nums.length) {
            result.add(new ArrayList<>(current));
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            if (visited[i]) continue;

            visited[i] = true;
            current.add(nums[i]);

            backtrack(nums, result, current, visited);

            current.remove(current.size() - 1);
            visited[i] = false;
        }
    }

    public static void main(String[] args) {
        PermutationBacktracking pb = new PermutationBacktracking();
        int[] nums = {1, 2, 3};

        List<List<Integer>> result = pb.permute(nums);

        System.out.println(result);
    }
}
