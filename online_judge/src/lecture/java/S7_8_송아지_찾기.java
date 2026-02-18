package lecture.java;

import java.util.LinkedList;
import java.util.Queue;

class S7_8_송아지_찾기 {
    public static int[] dis = { 1, -1, 5 };
    public static int[] ch;

    public static int solution(int s, int e) {
        Queue<Integer> queue = new LinkedList<>();
        ch = new int[10001];
        ch[s] = 1;
        queue.offer(s);
        int L = 0;

        while (!queue.isEmpty()) {
            int len = queue.size();
            for (int i = 0; i < len; i++) {
                int x = queue.poll();                

                for (int j = 0; j < 3; j++) {
                    int nx = x + dis[j];

                    if (nx == e) return L + 1;

                    if (nx >= 1 && nx <= 10000 && ch[nx] == 0) {
                        ch[nx] = 1;
                        queue.offer(nx);
                    }
                }
            }

            L++;
        }

        return 0;
    }
}
