import java.util.*;

class P3052_나머지 {
    public static void getMod(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int n : nums) {
            set.add(n % 42);
        }
        System.out.println(set.size());
    }
}
