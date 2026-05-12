package leetcode.combinations_77;

import java.util.ArrayList;
import java.util.List;

public class CombinationsBacktracking {
    List<List<Integer>> ans = new ArrayList<>();

    public void solve(int start, int n, int k, List<Integer> temp) {

        if(temp.size() == k) {
            ans.add(new ArrayList<>(temp));
            return;
        }

        for(int i = start; i <= n; i++) {
            temp.add(i);
            solve(i + 1, n, k, temp);
            temp.remove(temp.size() - 1);
        }
    }

    public List<List<Integer>> combine(int n, int k) {
        solve(1, n, k, new ArrayList<>());
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(new CombinationsBacktracking().combine(4, 2));
    }
}
