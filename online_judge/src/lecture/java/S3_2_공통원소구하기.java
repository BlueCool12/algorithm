package lecture.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class S3_2_공통원소구하기 {
    public static void solution(int n, int[] a, int m, int[] b) {
        List<Integer> list = new ArrayList<>();

        Arrays.sort(a);
        Arrays.sort(b);

        int p1 = 0;
        int p2 = 0;

        while(p1 < n && p2 < m) {
            if (a[p1] == b[p2]) {
                list.add(a[p1]);
                p1++;
                p2++;
            } else if (a[p1] < b[p2]) {
                p1++;
            } else {
                p2++;
            }
        }

        for (int answer : list) {
            System.out.print(answer + " ");
        }
    }
}
