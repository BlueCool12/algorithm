package lecture.java;

import java.util.LinkedList;
import java.util.Queue;

class S7_10_말단노드까지의_가장_짧은_경로_BFS {
    public static class Node {
        int data;
        Node lt, rt;

        public Node(int val) {
            data = val;
            lt = null;
            rt = null;
        }
    }

    public static int solution(Node root) {
        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);
        int L = 0;

        while (!queue.isEmpty()) {
            int len = queue.size();
            for (int i = 0; i < len; i++) {
                Node cur = queue.poll();
                if (cur.lt == null && cur.rt == null) {
                    return L;
                }

                if (cur.lt != null) {
                    queue.offer(cur.lt);
                }

                if (cur.rt != null) {
                    queue.offer(cur.rt);
                }
            }

            L++;
        }

        return 0;
    }
}
