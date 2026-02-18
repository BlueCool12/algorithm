package lecture.java;

class S7_3_팩토리얼 {
    public static int solution(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n * solution(n - 1);
        }
    }
}
