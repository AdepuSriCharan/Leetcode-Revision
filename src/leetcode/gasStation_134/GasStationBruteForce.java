package leetcode.gasStation_134;

public class GasStationBruteForce {
    private static int canCompleteCircuitBrute(int[] gas, int[] cost) {
        int n = gas.length;

        for (int start = 0; start < n; start++) {
            int tank = 0;
            boolean success = true;

            for (int count = 0; count < n; count++) {
                int i = (start + count) % n;

                tank += gas[i] - cost[i];

                if (tank < 0) {
                    success = false;
                    break;
                }
            }
            if (success)
                return start;
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] gas1 = {1,2,3,4,5};
        int[] cost1 = {3,4,5,1,2};

        System.out.println(canCompleteCircuitBrute(gas1, cost1));

        int[] gas2 = {2,3,4};
        int[] cost2 = {3,4,3};

        System.out.println(canCompleteCircuitBrute(gas2, cost2));
    }
}
