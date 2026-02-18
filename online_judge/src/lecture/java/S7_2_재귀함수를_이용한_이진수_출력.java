package lecture.java;

class S7_2_재귀함수를_이용한_이진수_출력 {
    public static void solution(int n) {
        if (n == 0) {
            return;
        } else {
            solution(n / 2);
            System.out.print(n % 2);            
        }
    }
}
