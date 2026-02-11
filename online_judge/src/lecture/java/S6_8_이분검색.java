package lecture.java;

import java.util.Arrays;

class S6_8_이분검색 {
    public static void solution(int n, int m, int[] arr) {
        int answer = 0;
        Arrays.sort(arr);
        
        int lt = 0, rt = n - 1;
        while (lt <= rt) {
            int mid = (lt + rt) / 2;
            if (arr[mid] == m) {
                answer = mid + 1;
                break;
            } else if (arr[mid] > m) {
                rt = mid - 1;
            } else {
                lt = mid + 1;
            }
        }

        System.out.println(answer);
    }
}
