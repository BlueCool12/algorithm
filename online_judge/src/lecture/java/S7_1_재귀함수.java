package lecture.java;

class S7_1_재귀함수 {
    public static void solution(int n) {
        if (n == 0) return;
                
        solution(n - 1);
        System.out.print(n + " ");
    }
}
