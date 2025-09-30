import java.util.ArrayDeque;
import java.util.Deque;

/**
 * 1. while문 대신 for문으로 고정 반복 후 한 번에 카운트도 가능
 */
class P1021_회전하는_큐 {
    public static void get(int N, int M, int[] targets) {
        Deque<Integer> deque = new ArrayDeque<>(N);

        for (int i = 1; i <= N; i++) {
            deque.addLast(i);
        }

        int count = 0;
        for (int target : targets) {
            int targetIdx = 0;
            for (Integer i : deque) {
                if (i == target)
                    break;
                targetIdx++;
            }

            int left = targetIdx;
            int right = deque.size() - targetIdx;

            // if (left <= right) {
            // while (deque.peekFirst() != target) {
            // deque.addLast(deque.pollFirst());
            // count++;
            // }
            // deque.pollFirst();
            // } else {
            // while (deque.peekFirst() != target) {
            // deque.addFirst(deque.pollLast());
            // count++;
            // }
            // deque.pollFirst();
            // }

            if (left <= right) {
                for (int k = 0; k < left; k++)
                    deque.addLast(deque.pollFirst());
                count += left;
            } else {
                for (int k = 0; k < right; k++)
                    deque.addFirst(deque.pollLast());
                count += right;
            }

            deque.pollFirst();
        }

        System.out.println(count);
    }
}
