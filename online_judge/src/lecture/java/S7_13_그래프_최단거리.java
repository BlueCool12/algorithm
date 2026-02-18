package lecture.java;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

class S7_13_그래프_최단거리 {
    public static int n, m;
    public static ArrayList<ArrayList<Integer>> graph;
    public static int[] ch, dis;

    public static void solution(int v) {
        Queue<Integer> queue = new LinkedList<>();
        ch[v] = 1;
        dis[v] = 0;
        queue.offer(v);

        while (!queue.isEmpty()) {
            int cv = queue.poll();

            for (int nv : graph.get(cv)) {
                if (ch[nv] == 0) {
                    ch[nv] = 1;
                    queue.offer(nv);
                    dis[nv] = dis[cv] + 1;
                }
            }
        }
    }
}
