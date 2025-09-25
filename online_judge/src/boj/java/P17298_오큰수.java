import java.util.ArrayDeque;
import java.util.Deque;

/**
 * 1. 자바에서는 Stack을 Deque를 이용하는걸 권장
 */
class P17298_오큰수 {
    public static void get(int N, int[] numbers) {
        Deque<Integer> stack = new ArrayDeque<Integer>();

        int[] answer = new int[N];
        for (int i = N - 1; i >= 0; i--) {
            while (!stack.isEmpty() && stack.peek() <= numbers[i]) {
                stack.pop();
            }

            // if (!stack.isEmpty()) {
            //     answer[i] = stack.peek();
            // } else {
            //     answer[i] = -1;
            // }
            answer[i] = stack.isEmpty() ? -1 : stack.peek();

            stack.push(numbers[i]);            
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < answer.length; i++) {
            sb.append(answer[i] + " ");
        }

        System.out.println(sb.toString().trim());
    }
}
