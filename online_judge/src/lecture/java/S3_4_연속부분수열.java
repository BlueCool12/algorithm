package lecture.java;

class S3_4_연속부분수열 {
    public static void solution(int n, int m, int[] arr) {
        // int lt = 0, rt = 0;
        // int sum = 0;

        // int count = 0;
        // for (int i = 0; i < n; i++) {
        //     sum += arr[rt++];

        //     if (sum == m) {
        //         count++;
        //     } else if (sum > m) {
        //         while (sum > m) {
        //             sum -= arr[lt++];

        //             if (sum == m) {
        //                 count++;
        //             }
        //         }
        //     }
        // }

        // System.out.println(count);

        int answer = 0, sum = 0, lt = 0;
        for (int rt = 0; rt < n; rt++) {
            sum += arr[rt];
            if (sum == m) {
                answer++;
            }

            while (sum >= m) {
                sum -= arr[lt++];
                if (sum == m) {
                    answer++;
                }
            }
        }

        System.out.println(answer);
    }
}
