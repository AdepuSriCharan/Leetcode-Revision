package leetcode.furthestHouses_2078;

public class FurthestHousesTwoPointer {
    private static int maxDistance(int[] colors) {

        int left = 0, right = colors.length - 1;

        if (colors[left] != colors[right]) {
            return right - left;
        }

        int maxDistance = 0;

        int currentRight = right;
        while (currentRight >= 0 && colors[currentRight] == colors[left]) {
            currentRight--;
        }
        maxDistance = Math.max(maxDistance, currentRight - left);

        int currentLeft = left;
        while (currentLeft < colors.length && colors[currentLeft] == colors[right]) {
            currentLeft++;
        }
        maxDistance = Math.max(maxDistance, right - currentLeft);

        return maxDistance;
    }
    public static void main(String[] args) {

        int[] colors1 = {1,1,1,6,1,1,1};
        int[] colors2 = {1,8,3,8,3};
        int[] colors3 = {0,1};

        System.out.println(maxDistance(colors1));
        System.out.println(maxDistance(colors2));
        System.out.println(maxDistance(colors3));
    }
}
