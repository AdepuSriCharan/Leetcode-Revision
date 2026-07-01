package leetcode.repeatedDNASequence_189;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RepeatedDNASequenceBruteForce {
    private static List<String> findRepeatedDnaSequences(String s) {

        Set<String> ans = new HashSet<>();

        for (int i = 0; i <= s.length() - 10; i++) {

            String first = s.substring(i, i + 10);

            for (int j = i + 1; j <= s.length() - 10; j++) {

                String second = s.substring(j, j + 10);

                if (first.equals(second))
                    ans.add(first);
            }
        }

        return new ArrayList<>(ans);
    }

    public static void main(String[] args) {

        String s = "AAAAAAAAAAAAA";

        System.out.println(findRepeatedDnaSequences(s));
    }
}
