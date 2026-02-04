package lecture.java;

class S2_11_임시반장_정하기 {
    public static void solution(int n, int[][] arr) {
        // int answer = 0;
        // int total = Integer.MIN_VALUE;

        // for (int i = 0; i < n; i++) {
        //     int sum = 0;
        //     for (int j = 0; j < n; j++) {
        //         int count = 0;

        //         for (int k = 0; k < n; k++) {
        //             if (i == k) continue;

        //             if (arr[k][j] == arr[i][j]) {
        //                 count++;
        //             }
        //         }

        //         sum += count;
        //     }

        //     if (total < sum) {
        //         total = sum;
        //         answer = i + 1;
        //     }
        // }

        // System.out.println(answer);

        int answer = 0, min = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            int cnt = 0;
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < 5; k++) {
                    if (arr[i][k] == arr[j][k]) {
                        cnt++;
                        break;
                    }
                }
            }

            if (cnt > min) {
                min = cnt;
                answer = i + 1;
            }
        }

        System.out.println(answer);
    }
}
