package leetcode.validPathGraph_1971;

import java.util.ArrayList;
import java.util.List;

public class ValidPathExists {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        List<List<Integer>> graph = new ArrayList<>();

        for(int i = 0; i < n; i++){
            graph.add(new ArrayList<>());
        }

        for (int[] edge : edges){
            int u = edge[0];
            int v = edge[1];

            graph.get(u).add(v);
            graph.get(v).add(u);
        }
        boolean[] visited = new boolean[n];

        return dfs(source, destination, graph, visited);
    }

    private static boolean dfs(int source, int destination, List<List<Integer>> graph, boolean[] visited) {
        if (source == destination){
            return true;
        }
        visited[source] = true;
        for (int neighbour : graph.get(source)){
            if (!visited[neighbour]){
                if (dfs(neighbour, destination, graph, visited)){
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {

        ValidPathExists solution = new ValidPathExists();

        int n1 = 3;
        int[][] edges1 = {
                {0, 1},
                {1, 2},
                {2, 0}
        };
        int source1 = 0;
        int destination1 = 2;

        System.out.println(
                solution.validPath(n1, edges1, source1, destination1)
        );

        int n2 = 6;
        int[][] edges2 = {
                {0, 1},
                {0, 2},
                {3, 5},
                {5, 4},
                {4, 3}
        };
        int source2 = 0;
        int destination2 = 5;

        System.out.println(
                solution.validPath(n2, edges2, source2, destination2)
        );
    }
}
