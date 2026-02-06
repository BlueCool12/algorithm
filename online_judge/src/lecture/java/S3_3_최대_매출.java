package lecture.java;

class S3_3_최대_매출 {
    public static void solution(int n, int k, int[] arr) {
        int answer = Integer.MIN_VALUE;

        // for (int i = 0; i < n - k; i++) {
        //     int sum = 0;

        //     for (int j = 0; j < k; j++) {
        //         sum += arr[i + j];
        //     }

        //     if (sum > answer) {
        //         answer = sum;
        //     }
        // }

        // int sum = 0;
        // int count = 0;
        // for (int i = 0; i < n; i++) {
            
        //     if (count < k) {
        //         sum += arr[i];
        //         count++;
        //     } else {
        //         sum -= arr[i - k];
        //         sum += arr[i];
        //     }

        //     answer = sum > answer ? sum : answer;
        // }

        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr[i];
        }

        answer = sum;
        for (int i = k; i < n; i++) {
            sum += (arr[i] - arr[i - k]);
            answer = Math.max(answer, sum);
        }

        System.out.println(answer);
    }
}
