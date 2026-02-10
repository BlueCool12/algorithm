package lecture.java;

import java.util.LinkedList;
import java.util.Queue;

class S5_7_교육과정_설계 {
    public static void solution(String need, String plan) {
        // String answer = "YES";
        // Queue<Character> queue = new LinkedList<>();

        // for (char ch : need.toCharArray()) {
        //     queue.offer(ch);
        // }

        // for (char ch : plan.toCharArray()) {
        //     if (!queue.isEmpty() && queue.peek() == ch) {
        //         queue.poll();
        //     }
        // }

        // if (!queue.isEmpty()) {
        //     answer = "NO";
        // }

        // System.out.println(answer);

        String answer = "YES";
        Queue<Character> queue = new LinkedList<>();

        for (char ch : need.toCharArray()) {
            queue.offer(ch);
        }

        for (char ch : plan.toCharArray()) {
            if (queue.contains(ch)) {
                if (ch != queue.poll()) {
                    System.out.println("NO");
                    break;
                }
            }
        }

        if (!queue.isEmpty()) {
            answer = "NO";
        }

        System.out.println(answer);
    }
}
