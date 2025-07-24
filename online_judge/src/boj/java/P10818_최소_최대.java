import java.util.Arrays;

class P10818_최소_최대 {
    public static int[] getMaxAndMin(int[] nums) {
        int[] maxAndMin = new int[2];
        maxAndMin[0] = Arrays.stream(nums).min().getAsInt();
        maxAndMin[1] = Arrays.stream(nums).max().getAsInt();
        return maxAndMin;
    }
}
