package lecture.java;

class S3_6_최대_길이_연속부분수열 {
    public static void solution(int n, int k, int[] arr) {
        int answer = 0, cnt = 0, lt = 0;

        for (int rt = 0; rt < n; rt++) {
            if (arr[rt] == 0) {
                cnt++;                
            }

            while (cnt > k) {
                if (arr[lt] == 0) {
                    cnt--;                    
                }

                lt++;
            }

            answer = Math.max(answer, rt - lt + 1);
        }

        System.out.println(answer);
    }
}
