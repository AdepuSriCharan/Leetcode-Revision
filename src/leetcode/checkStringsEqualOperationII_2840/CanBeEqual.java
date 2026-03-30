package leetcode.checkStringsEqualOperationII_2840;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CanBeEqual {
    private static boolean checkStrings(String s1, String s2) {
        List<Character> even1 = new ArrayList<>();
        List<Character> odd1 = new ArrayList<>();
        List<Character> even2 = new ArrayList<>();
        List<Character> odd2 = new ArrayList<>();

        for (int i = 0; i < s1.length(); i++) {
            if (i % 2 == 0) {
                even1.add(s1.charAt(i));
                even2.add(s2.charAt(i));
            } else {
                odd1.add(s1.charAt(i));
                odd2.add(s2.charAt(i));
            }
        }

        Collections.sort(even1);
        Collections.sort(even2);
        Collections.sort(odd1);
        Collections.sort(odd2);

        return even1.equals(even2) && odd1.equals(odd2);
    }
    public static void main(String[] args) {
        String s1 = "abcd";
        String s2 = "cdab";

        boolean result = checkStrings(s1, s2);

        if (result) {
            System.out.println("Strings are equivalent.");
        } else {
            System.out.println("Strings are NOT equivalent.");
        }
    }
}
