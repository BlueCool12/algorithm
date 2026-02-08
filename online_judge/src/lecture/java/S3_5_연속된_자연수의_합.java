package lecture.java;

class S3_5_연속된_자연수의_합 {
    public static void solution(int n) {
        // int[] arr = new int[n + 1];
        // for (int i = 1; i < n; i++) {
        //     arr[i] = i;
        // }

        // int lt = 1, rt = 1;
        // int sum = 0, count = 0;
        // while (lt < n && rt < n) {
        //     sum += arr[rt++];
        //     if (sum == n) {
        //         count++;
        //     } else if (sum >= n) {
        //         while (sum > n) {
        //             sum -= arr[lt++];
        //         }

        //         if (sum == n) {
        //             count++;
        //         }
        //     }            
        // }

        // System.out.println(count);



        // int answer = 0, sum = 0, lt = 0;
        // int m = n / 2 + 1;
        // int[] arr = new int[m];

        // for (int i = 0; i < m; i++) {
        //     arr[i] = i + 1;
        // }

        // for (int rt = 0; rt < m; rt++) {
        //     sum += arr[rt];
        //     if (sum == n) {
        //         answer++;
        //     }
            
        //     while (sum >= n) {
        //         sum -= arr[lt++];
        //         if (sum == n) {
        //             answer++;
        //         }
        //     }
        // }

        // System.out.println(answer);



        int answer = 0, cnt = 1;
        
        n--;
        while (n > 0) {
            cnt++;

            n = n - cnt;
            if (n % cnt == 0) {
                answer++;
            }
        }

        System.out.println(answer);
    }
}
