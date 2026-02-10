package lecture.java;

import java.util.LinkedList;
import java.util.Queue;

class S5_6_공주_구하기 {
    public static void solution(int n, int k) {
        int answer = 0;
        Queue<Integer> queue = new LinkedList<>();

        for (int i = 1; i <= n; i++) {
            queue.offer(i);
        }

        while (!queue.isEmpty()) {
            for (int i = 1; i < k; i++) {
                queue.offer(queue.poll());
            }

            queue.poll();

            if (queue.size() == 1) {
                answer = queue.poll();
            }
        }

        System.out.println(answer);
    }
}
