package lecture.java;

class S7_11_경로_탐색_DFS {
    public static int n, m, answer = 0;
    public static int[][] graph;
    public static int[] ch;

    public static void solution(int v) {
        if (v == n) {
            answer++;
        } else {
            for (int i = 1; i <= n; i++) {
                if (graph[v][i] == 1 && ch[i] == 0) {
                    ch[i] = 1;
                    solution(i);
                    ch[i] = 0;
                }
            }
        }
    }
}
