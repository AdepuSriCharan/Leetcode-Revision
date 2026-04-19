package leetcode.gasStation_134;

public class GasStationGreedy {
    private static int canCompleteCircuit(int[] gas, int[] cost) {
        int totalGas = 0;
        int tank = 0;
        int start = 0;

        for (int i = 0; i < gas.length; i++) {
            int diff = gas[i] - cost[i];

            totalGas += diff;
            tank += diff;

            if (tank < 0) {
                start = i + 1;
                tank = 0;
            }
        }

        return totalGas >= 0 ? start : -1;
    }

    public static void main(String[] args) {
        int[] gas1 = {1,2,3,4,5};
        int[] cost1 = {3,4,5,1,2};

        System.out.println(canCompleteCircuit(gas1, cost1));

        int[] gas2 = {2,3,4};
        int[] cost2 = {3,4,3};

        System.out.println(canCompleteCircuit(gas2, cost2));
    }
}
