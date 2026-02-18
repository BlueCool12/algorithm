package lecture.java;

class S7_4_피보나치_재귀 {
    public static int solution(int n) {
        if (n == 1) {
            return 1;
        } else if (n == 2) {
            return 1;
        } else {
            return solution(n - 2) + solution(n - 1);
        }
    }
}
