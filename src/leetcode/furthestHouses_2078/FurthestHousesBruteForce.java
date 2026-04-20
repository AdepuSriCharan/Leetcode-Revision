package leetcode.furthestHouses_2078;

public class FurthestHousesBruteForce {
    private static int maxDistance(int[] colors) {
        int maxDistance = 0;

        for (int i = 0; i < colors.length; i++){
            for (int j = i + 1; j < colors.length; j++){
                if (colors[i] != colors[j]){
                    int currentDistance = Math.abs(i - j);
                    maxDistance = Math.max(maxDistance, currentDistance);
                }
            }
        }
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
