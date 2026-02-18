package lecture.java;

import java.util.ArrayList;

class S7_12_경로_탐색_인접리스트 {
    public static int n, m, answer = 0;
    public static ArrayList<ArrayList<Integer>> graph;
    public static int[] ch;

    public static void solution(int v) {
        if (v == n) {
            answer++;
        } else {
            for (int nv : graph.get(v)) {
                if (ch[nv] == 0) {
                    ch[nv] = 1;
                    solution(nv);
                    ch[nv] = 0;
                }
            }
        }
    }
}
