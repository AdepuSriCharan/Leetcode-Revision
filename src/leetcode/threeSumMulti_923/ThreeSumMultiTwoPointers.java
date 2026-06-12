package leetcode.threeSumMulti_923;


import java.util.Arrays;

public class ThreeSumMultiTwoPointers {
    public static int threeSumMulti(int[] arr, int target) {
        Arrays.sort(arr);

        long ans = 0;
        int MOD = 1_000_000_007;
        int n = arr.length;

        for (int i = 0; i < n; i++) {

            int left = i + 1;
            int right = n - 1;

            while (left < right) {

                int sum = arr[i] + arr[left] + arr[right];

                if (sum < target) {
                    left++;
                }
                else if (sum > target) {
                    right--;
                }
                else {

                    if (arr[left] != arr[right]) {

                        long leftCount = 1;
                        long rightCount = 1;

                        while (left + 1 < right &&
                                arr[left] == arr[left + 1]) {
                            leftCount++;
                            left++;
                        }

                        while (right - 1 > left &&
                                arr[right] == arr[right - 1]) {
                            rightCount++;
                            right--;
                        }

                        ans += leftCount * rightCount;

                        left++;
                        right--;
                    }
                    else {

                        long m = right - left + 1;

                        ans += m * (m - 1) / 2;
                        break;
                    }
                }
            }
        }

        return (int)(ans % MOD);
    }

    public static void main(String[] args) {

        int[] arr1 = {1,1,2,2,3,3,4,4,5,5};
        int target1 = 8;

        int[] arr2 = {1,1,2,2,2,2};
        int target2 = 5;

        int[] arr3 = {2,1,3};
        int target3 = 6;

        System.out.println(threeSumMulti(arr1, target1));
        System.out.println(threeSumMulti(arr2, target2));
        System.out.println(threeSumMulti(arr3, target3));
    }
}
