/**
 * 1. 이중 연결 리스트로 구현
 * 2. 객체 생성/포인터 추적 없이 StringBuilder 두 개로도 구현 가능
 */

class P5397_키로거 {
    public static void get(String test) {
        // KeyLogger logger = new KeyLogger();
        // for (char ch : test.toCharArray()) {
        //     if (ch == '<') {
        //         logger.moveLeft();
        //     } else if (ch == '>') {
        //         logger.moveRight();
        //     } else if (ch == '-') {
        //         logger.backspace();
        //     } else {
        //         logger.insert(ch);
        //     }
        // }

        // System.out.println(logger.build());

        StringBuilder left = new StringBuilder(test.length());
        StringBuilder right = new StringBuilder();

        for (int i = 0; i < test.length(); i++) {
            char ch = test.charAt(i);
            switch (ch) {
                case '<':
                    if (left.length() > 0) {
                        right.append(left.charAt(left.length() - 1));
                        left.setLength(left.length() - 1);
                    }
                    break;
                case '>':
                    if (right.length() > 0) {
                        left.append(right.charAt(right.length() - 1));
                        right.setLength(right.length() - 1);
                    }
                    break;
                case '-':
                    if (left.length() > 0) left.setLength(left.length() - 1);
                    break;            
                default:
                    left.append(ch);
            }
        }

        for (int i = right.length() - 1; i >= 0; i--) left.append(right.charAt(i));
        System.out.println(left.toString());
    }
}

// class Node {
//     char data;
//     Node prev;
//     Node next;

//     Node() {
//     }

//     Node(char data) {
//         this.data = data;
//     }
// }

// class KeyLogger {
//     private final Node head = new Node();
//     private final Node tail = new Node();
//     private Node current;

//     KeyLogger() {
//         head.next = tail;
//         tail.prev = head;
//         current = head;
//     }

//     void moveLeft() {
//         if (current != head)
//             current = current.prev;
//     }

//     void moveRight() {
//         if (current.next != tail)
//             current = current.next;
//     }

//     void backspace() {
//         if (current == head)
//             return;

//         Node delete = current;
//         current = current.prev;
//         current.next = delete.next;
//         delete.next.prev = current;
//     }

//     void insert(char data) {
//         Node node = new Node(data);
//         node.prev = current;
//         node.next = current.next;
//         current.next.prev = node;
//         current.next = node;
//         current = node;
//     }

//     String build() {
//         StringBuilder sb = new StringBuilder();
//         for (Node n = head.next; n != tail; n = n.next) {
//             sb.append(n.data);
//         }
//         return sb.toString();
//     }
// }