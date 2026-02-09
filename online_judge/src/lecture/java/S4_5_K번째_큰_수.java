package lecture.java;

import java.util.Collections;
import java.util.TreeSet;

class S4_5_K번째_큰_수 {
    public static void solution(int n, int k, int[] arr) {
        int answer = 0;
        TreeSet<Integer> set = new TreeSet<>(Collections.reverseOrder());

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int l = j + 1; l < n; l++) {
                    set.add(arr[i] + arr[j] + arr[l]);
                }
            }
        }

        int cnt = 0;
        for (int value : set) {            
            if (++cnt == k) {
                answer = value;
            }
        }

        System.out.println(answer);
    }
}
