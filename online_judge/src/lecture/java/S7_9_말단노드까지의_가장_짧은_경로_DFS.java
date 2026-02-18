package lecture.java;

class S7_9_말단노드까지의_가장_짧은_경로_DFS {
    public static class Node {
        int data;
        Node lt, rt;

        public Node(int val) {
            data = val;
            lt = null;
            rt = null;
        }
    }

    public static int solution(int L, Node root) {
        if (root.lt == null && root.rt == null) {
            return L;
        } else {
            return Math.min(solution(L + 1, root.lt), solution(L + 1, root.rt));
        }
    }
}
