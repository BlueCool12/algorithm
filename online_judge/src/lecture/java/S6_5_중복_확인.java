package lecture.java;

import java.util.Arrays;
// import java.util.HashMap;
// import java.util.Map;

class S6_5_중복_확인 {
    public static void solution(int n, int[] arr) {
        // String answer = "U";
        // Map<Integer, Integer> map = new HashMap<>();

        // for (int i = 0; i < arr.length; i++) {
        //     map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);

        //     if (map.get(arr[i]) > 1) {
        //         answer = "D";
        //     }
        // }

        // System.out.println(answer);

        String answer = "U";

        Arrays.sort(arr);
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] == arr[i + 1]) {
                answer = "D";
            }
        }

        System.out.println(answer);
    }
}
