package leetcode.validAnagram_242;

import java.util.HashMap;

/*
Time Complexity: O(n)
Space Complexity: O(n)
*/

public class ValidAnagramHashMap {
    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length())
            return false;
        HashMap<Character, Integer> map = new HashMap<>();
        for (char c : s.toCharArray()){
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        System.out.println(map);
        for (char c : t.toCharArray()){
            if (!map.containsKey(c)){
                return false;
            }
            map.put(c, map.get(c) - 1);
            if (map.get(c) == 0){
                map.remove(c);
            }
        }
        return map.isEmpty();
    }

    public static void main(String[] args) {

        String s = "anagramsasa";
        String t = "nagaramasas";

        System.out.println(isAnagram(s, t));
    }
}
