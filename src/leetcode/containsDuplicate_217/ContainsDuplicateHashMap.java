package leetcode.containsDuplicate_217;

import java.util.HashMap;

public class ContainsDuplicateHashMap {
    public boolean containsDuplicate(int[] nums) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            if (map.containsKey(num)) {
                return true;
            }
            map.put(num, 1);
        }
        return false;
    }
}
