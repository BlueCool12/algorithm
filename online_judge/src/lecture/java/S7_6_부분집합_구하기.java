package lecture.java;

class S7_6_부분집합_구하기 {
    static int n;
    static int[] ch;

    public static void solution(int L) {
        if (L == n + 1) {
            String answer = "";
            for (int i = 1; i <= n; i++) {
                if (ch[i] == 1) {
                    answer += i + " ";
                }
            }

            if (answer.length() > 0) {
                System.out.println(answer);
            }            
        } else {
            ch[L] = 1;
            solution(L + 1);
            ch[L] = 0;
            solution(L + 1);
        }
    }
}
