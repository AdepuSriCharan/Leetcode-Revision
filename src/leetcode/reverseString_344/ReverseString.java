package leetcode.reverseString_344;

public class ReverseString {
    private void reverseString(char[] s) {
        int left = 0;
        int right = s.length - 1;
        while(left < right){
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;
            left++;
            right--;
        }
    }

    public static void main(String[] args) {
        ReverseString obj = new ReverseString();

        char[] input = {'h', 'e', 'l', 'l', 'o'};

        System.out.println("Original array:");
        for (char c : input) {
            System.out.print(c + " ");
        }

        obj.reverseString(input);

        System.out.println("\nReversed array:");
        for (char c : input) {
            System.out.print(c + " ");
        }
    }
}
