package lecture.java;

import java.util.ArrayList;
import java.util.Arrays;

class S6_6_장난꾸러기 {
    public static void solution(int n, int[] heights) {
        ArrayList<Integer> answer = new ArrayList<>();

        int[] tmp = heights.clone();
        Arrays.sort(tmp);

        for (int i = 0; i < n; i++) {
            if (heights[i] != tmp[i]) {
                answer.add(i + 1);
            }
        }

        for (int h : answer) {
            System.out.print(h + " ");
        }
    }
}
