package leetcode.reverseWords_151;

public class ReverseWords {

    public String reverseWords(String s) {
        String[] words = s.trim().split("\\s+");

        int left = 0, right = words.length - 1;
        while (left < right) {
            String temp = words[left];
            words[left] = words[right];
            words[right] = temp;
            left++;
            right--;
        }

        return String.join(" ", words);
    }

    public static void main(String[] args) {
        ReverseWords obj = new ReverseWords();

        String input = "  the sky   is blue  ";
        String result = obj.reverseWords(input);

        System.out.println("Original: " + input);
        System.out.println("Reversed Words: " + result);
    }
}