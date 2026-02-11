package lecture.java;

import java.util.Arrays;

class S6_10_마구간_정하기 {
    public static void solution(int n, int c, int[] xi) {
        int answer = 0;
        Arrays.sort(xi);

        int lt = 1, rt = xi[n - 1];
        while (lt <= rt) {
            int mid = (lt + rt) / 2;

            if (count(xi, mid) >= c) {
                answer = mid;
                lt = mid + 1;
            } else {
                rt = mid - 1;
            }
        }

        System.out.println(answer);
    }

    private static int count(int[] arr, int dist) {
        int cnt = 1;
        int ep = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] - ep >= dist) {
                cnt++;
                ep = arr[i];
            }
        }

        return cnt;
    }
}
