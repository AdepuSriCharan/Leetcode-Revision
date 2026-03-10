package leetcode.reverseVowels_345;

public class ReverseVowels {

    public static String reverseVowels(String s) {
        char[] chars = s.toCharArray();
        int left = 0, right = chars.length - 1;
        String vowels = "aeiouAEIOU";

        while (left < right) {

            while (left < right && vowels.indexOf(chars[left]) == -1) {
                left++;
            }

            while (left < right && vowels.indexOf(chars[right]) == -1) {
                right--;
            }

            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;

            left++;
            right--;
        }

        return new String(chars);
    }

    public static void main(String[] args) {
        String input = "hello";
        String result = reverseVowels(input);

        System.out.println("Original String: " + input);
        System.out.println("After Reversing Vowels: " + result);
    }
}
