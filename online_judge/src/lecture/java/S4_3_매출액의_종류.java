package lecture.java;

import java.util.HashMap;

class S4_3_매출액의_종류 {
    public static void solution(int n, int k, int[] arr) {
        // int lt = 0;

        // HashMap<Integer, Integer> map = new HashMap<>();
        // for (int i = 0; i < n; i++) {
        //     map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);

        //     if (i - lt == k - 1) {
        //         System.out.print(map.size() + " ");

        //         if (map.get(arr[lt]) - 1 == 0) {
        //             map.remove(arr[lt]);
        //             lt++;
        //         } else {
        //             map.put(arr[lt], map.get(arr[lt]) - 1);
        //             lt++;
        //         }                
        //     }
        // }

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < k - 1; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }

        int lt = 0;
        for (int rt = k - 1; rt < n; rt++) {
            map.put(arr[rt], map.getOrDefault(arr[rt], 0) + 1);
            System.out.print(map.size() + " ");
            
            map.put(arr[lt], map.get(arr[lt]) - 1);
            if (map.get(arr[lt]) == 0) {
                map.remove(arr[lt]);
            }

            lt++;
        }
    }
}
