package lecture.java;

class S2_5_소수_에라토스테네스_체 {
    public static void solution(int n) {
        boolean[] answer = new boolean[n + 1];        
        int count = 0;

        for (int i = 2; i <= n; i++) {
            if (!answer[i]) {
                count++;
                for (int j = i; j <= n; j += i) {
                    answer[j] = true;
                }
            }
        }

        System.out.println(count);
    }
}
