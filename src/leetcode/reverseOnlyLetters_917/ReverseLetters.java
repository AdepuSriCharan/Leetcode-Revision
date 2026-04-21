package leetcode.reverseOnlyLetters_917;

public class ReverseLetters {
    private static String reverseOnlyLetters(String s) {
        char[] arr = s.toCharArray();
        int left = 0, right = arr.length - 1;

        while (left < right) {
            if (Character.isLetter(arr[left]) && Character.isLetter(arr[right])) {
                char temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            } else if (!Character.isLetter(arr[left])) {
                left++;
            } else {
                right--;
            }
        }

        return new String(arr);
    }
    public static void main(String[] args) {

        String input1 = "ab-cd";
        String input2 = "a-bC-dEf-ghIj";
        String input3 = "Test1ng-Leet=code-Q!";

        System.out.println(reverseOnlyLetters(input1));
        System.out.println(reverseOnlyLetters(input2));
        System.out.println(reverseOnlyLetters(input3));
    }
}
