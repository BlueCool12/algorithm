import java.util.ArrayDeque;
import java.util.Deque;

/**
 * 1. 단조 감소 스택을 사용한 문제
 * 2. 왼쪽에서 오른쪽 순서로 stack에 왼쪽 후보들을 보관
 * 3. 현재 높이보다 작거나 같은 탑은 신호를 못받기 때문에 stack에서 제거
 * 4. stack에 남아있다면 peek()의 index가 신호 수신 탑
 * 5. 후에 자기자신을 push
 */

class P2493_탑 {
    public static void get(int N, int[] towers) {
        int[] orders = new int[N];

        Deque<int[]> stack = new ArrayDeque<>();

        for (int i = 0; i < N; i++) {
            int height = towers[i];

            while (!stack.isEmpty() && stack.peek()[1] <= height) {
                stack.pop();
            }

            orders[i] = stack.isEmpty() ? 0 : (stack.peek()[0] + 1);

            stack.push(new int[] { i, height });
        }
        
        StringBuilder sb = new StringBuilder();
        for (int order : orders) {
            sb.append(order).append(' ');
        }
        System.out.println(sb.toString());
    }
}
