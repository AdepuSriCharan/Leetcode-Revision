package leetcode.largestNumber_179;

public class LargestNumberBruteForce {
    String answer = "";

    public String largestNumber(int[] nums) {
        boolean[] visited = new boolean[nums.length];
        backtrack(nums, visited, new StringBuilder(), 0);

        if (answer.charAt(0) == '0')
            return "0";

        return answer;
    }

    private void backtrack(int[] nums, boolean[] visited,
                           StringBuilder current, int count) {

        if (count == nums.length) {

            String candidate = current.toString();

            if (answer.isEmpty() || candidate.compareTo(answer) > 0)
                answer = candidate;

            return;
        }

        for (int i = 0; i < nums.length; i++) {

            if (!visited[i]) {

                visited[i] = true;

                int len = current.length();
                current.append(nums[i]);

                backtrack(nums, visited, current, count + 1);

                current.setLength(len);
                visited[i] = false;
            }
        }
    }

    public static void main(String[] args) {
        System.out.println(new LargestNumberBruteForce().largestNumber(new int[]{3, 30, 34, 5, 9}));
    }
}
