package lecture.java;

class S2_12_멘토링 {
    public static void solution(int n, int m, int[][] arr) {
        int answer = 0;

        // 학생 수 * 학생 수 (경우의 수)
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                // 각 시험 통과 카운트
                int cnt = 0;

                // k = 시험 수
                for (int k = 0; k < m; k++) {
                    int mentor = 0, mentee = 0;

                    // s = 각 시험의 등수
                    for (int s = 0; s < n; s++) {
                        if (arr[k][s] == i) {
                            mentor = s;
                        }

                        if (arr[k][s] == j) {
                            mentee = s;
                        }

                        System.out.println("mentor: " + mentor + " menttee: " + mentee);
                    }

                    // 멘토의 등수가 멘티보다 작으면 (높으면)
                    if (mentor < mentee) {                        
                        cnt++;
                    }
                }

                // 모든 시험에서 등수가 높으면
                if (cnt == m) {
                    answer++;
                }
            }
        }

        System.out.println(answer);
    }
}
