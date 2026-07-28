package leetcode.SmallestPalindrome_3517;

import java.util.HashMap;

public class SmallestPalindrome {
    public String smallestPalindrome(String s) {

        HashMap<Character, Integer> map = new HashMap<>();

        for (char ch : s.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        StringBuilder left = new StringBuilder();
        char middle = '\0';
        for (char ch = 'a'; ch <= 'z'; ch++) {
            int freq = map.getOrDefault(ch, 0);

            for (int i = 0; i < freq / 2; i++) {
                left.append(ch);
            }

            if (freq % 2 == 1) {
                middle = ch;
            }
        }

        StringBuilder res = new StringBuilder();
        res.append(left);

        if (middle != '\0') {
            res.append(middle);
        }

        res.append(new StringBuilder(left).reverse());

        return res.toString();
    }

    public static void main(String[] args) {
        String s = "abccba";
        System.out.println(new SmallestPalindrome().smallestPalindrome(s));
    }
}
