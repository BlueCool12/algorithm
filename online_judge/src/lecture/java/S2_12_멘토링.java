package lecture.java;

class S2_12_멘토링 {
    public static void solution(int n, int m, int[][] arr) {
        int answer = 0;

        // 학생 * 학생 경우의 수
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                // 같은 학생이면 continue
                if (i == j) continue;

                // 각 시험 통과 횟수
                int count = 0;

                // t = 시험 수
                for (int t = 0; t < m; t++) {                    
                    int mentor = 0, mentee = 0;

                    // g = 등수
                    for (int g = 0; g < n; g++) {
                        // 각 시험의 등수가 i번 학생이면
                        if (arr[t][g] == i) {
                            mentor = g;
                        }

                        // 각 시험의 등수가 j번 학생이면
                        if (arr[t][g] == j) {
                            mentee = g;
                        }
                    }

                    // i번 학생이 j번 학생보다 등수가 높으면
                    if (mentor < mentee) {
                        count++;
                    }
                }

                // 모든 시험에서 등수가 높으면
                if (count == m) {
                    answer++;
                }
            }
        }

        System.out.println(answer);
    }
}
