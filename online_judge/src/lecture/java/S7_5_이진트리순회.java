package lecture.java;

class S7_5_이진트리순회 {
    public static void solution(Node root) {
        if (root == null) {
            return;
        } else {
            // System.out.print(root.data + " "); // 전위 순회
            solution(root.lt);
            // System.out.print(root.data + " "); // 중위 순회
            solution(root.rt);
            // System.out.print(root.data + " "); // 후위 순회
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
