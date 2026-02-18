package lecture.java;

import java.util.LinkedList;
import java.util.Queue;

class S7_7_이진트리_순회 {
    public static void solution(Node root) {
        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);        

        while (!queue.isEmpty()) {
            int len = queue.size();
            for (int i = 0; i < len; i++) {
                Node cur = queue.poll();
                System.out.print(cur.data + " ");

                if (cur.lt != null) {
                    queue.offer(cur.lt);
                }

                if (cur.rt != null) {
                    queue.offer(cur.rt);
                }
            }            
        }
    }

    public static class Node {
        int data;
        Node lt, rt;

        public Node(int val) {
            data = val;
            lt = null;
            rt = null;
        }
    }
}
