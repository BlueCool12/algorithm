package lecture.java;

class S2_7_점수계산 {
    public static void solution(int n, int[] arr) {
        int sum = 0;
        int score = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] == 0) {
                score = 0;
            } else {
                score++;
                sum += score;
            }
        }

        System.out.println(sum);
    }
}
