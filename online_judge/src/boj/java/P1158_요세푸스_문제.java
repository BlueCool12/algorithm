/**
 * 1. 원형 연결 리스트를 이용한 구현
 */

class P1158_요세푸스_문제 {
    public static void get(int N, int K) {
        Node head = new Node(1);
        Node tail = head;

        for (int i = 2; i <= N; i++) {
            tail.next = new Node(i);
            tail = tail.next;
        }
        tail.next = head;

        StringBuilder sb = new StringBuilder();
        sb.append('<');

        Node prev = tail;
        Node current = head;
        int remain = N;

        while (remain > 0) {
            for (int step = 1; step < K; step++) {
                prev = current;
                current = current.next;
            }

            sb.append(current.data);
            remain--;
            if (remain > 0)
                sb.append(", ");

            prev.next = current.next;
            current.next = null;
            current = prev.next;
        }

        sb.append('>');
        System.out.println(sb.toString());
    }
}

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
    }
}