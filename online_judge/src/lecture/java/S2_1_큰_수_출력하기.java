package lecture.java;

import java.util.ArrayList;
import java.util.List;

class S2_1_큰_수_출력하기 {
    public static void print(int n, int[] arr) {
        List<Integer> list = new ArrayList<>();

        list.add(arr[0]);
        for (int i = 1; i < n; i++) {
            if (arr[i] > arr[i - 1]) {
                list.add(arr[i]);
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i : list) {
            sb.append(i + " ");
        }

        System.out.println(sb.toString().trim());
    }
}
