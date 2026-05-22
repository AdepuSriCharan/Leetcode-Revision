package leetcode.keysRooms_841;

import java.util.List;

public class KeysAndRooms {
    private static boolean canVisitAllRooms(List<List<Integer>> rooms) {
        boolean[] visited = new boolean[rooms.size()];

        dfs(0, rooms, visited);

        for (boolean room : visited){
            if (!room){
                return false;
            }
        }
        return true;
    }

    private static void dfs(int room, List<List<Integer>> rooms, boolean[] visited){
        visited[room] = true;
        for (int key : rooms.get(room)){
            if (!visited[key]){
                dfs(key, rooms, visited);
            }
        }
    }
}
