package lecture.java;

class S2_9_격자판_최대합 {
    public static int solution(int n, int[][] arr) {
        // int sum = 0;

        // int leftCross = 0;
        // int rightCross = 0;
        // for (int i = 0; i < n; i++) {
        //     int rowTmp = 0;
        //     int colTmp = 0;
        //     for (int j = 0; j < n; j++) {
        //         rowTmp += arr[i][j];
        //         colTmp += arr[j][i];

        //         if (i == j) {
        //             leftCross += arr[i][j];
        //         }

        //         if (j == n - 1) {
        //             rightCross += arr[i][j - i];
        //         }
        //     }

        //     if (rowTmp > colTmp) {
        //         sum = Math.max(rowTmp, sum);
        //     }
        // }

        // int topCross = Math.max(leftCross, rightCross);
        // return Math.max(sum, topCross);

        int answer = Integer.MIN_VALUE;
        int sum1, sum2;

        for (int i = 0; i < n; i++) {
            sum1 = sum2 = 0;
            for (int j = 0; j < n; j++) {
                sum1 += arr[i][j];
                sum2 += arr[j][i];
            }
            answer = Math.max(answer, sum1);
            answer = Math.max(answer, sum2);
        }

        sum1 = sum2 = 0;
        for (int i = 0; i < n; i++) {
            sum1 += arr[i][i];
            sum2 += arr[i][n - i - 1];
        }
        answer = Math.max(answer, sum1);
        answer = Math.max(answer, sum2);

        return answer;
    }
}
