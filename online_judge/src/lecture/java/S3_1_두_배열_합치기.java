package lecture.java;

import java.util.ArrayList;
import java.util.List;

class S3_1_두_배열_합치기 {
    public static List<Integer> solution(int n, int m, int[] a, int[] b) {
        List<Integer> answer = new ArrayList<>();

        int p1 = 0, p2 = 0;
        while (p1 < n && p2 < m) {
            if (a[p1] < b[p2]) {
                answer.add(a[p1++]);
            } else {
                answer.add(b[p2++]);
            }
        }

        while (p1 < n) {
            answer.add(a[p1++]);
        }

        while (p2 < m) {
            answer.add(b[p2++]);
        }

        return answer;
    }
}
