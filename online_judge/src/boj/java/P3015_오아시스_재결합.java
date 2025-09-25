import java.util.ArrayDeque;
import java.util.Deque;

/**
 * 1. 같은 키에 대한 처리가 미흡한 부분 체크
 * 2. 단조 스택을 사용하여 현재 키보다 작은 키는 전부 pop 하며 pair += 그 사람들의 count
 * 3. 같은 키를 만나면 그 묶음의 count 만큼 pair에 더하고 같은 키 개수를 합친 뒤 진행
 * 4. 위 과정이 끝나고 스택이 비어있지 않다면 pair += 1
 * 5. (키, 같은 키 누적수)를 push
 */
class P3015_오아시스_재결합 {
    public static void getPair(int[] fans) {
        // Deque<Integer> stack = new ArrayDeque<Integer>();

        // Long pair = 0L;
        // for (int i = 0; i < fans.length; i++) {
        // if (!stack.isEmpty()) {
        // pair += stack.size();
        // }

        // if (!stack.isEmpty()) {
        // if (i != fans.length - 1 && fans[i] > fans[i + 1]) {
        // stack.clear();
        // } else {
        // while (!stack.isEmpty() && stack.peek() < fans[i]) {
        // stack.pop();
        // }
        // }
        // }

        // stack.push(fans[i]);
        // }

        // System.out.println(pair);

        Deque<long[]> stack = new ArrayDeque<>();
        long pairs = 0;

        for (int h : fans) {
            long cntSame = 1;

            while (!stack.isEmpty() && stack.peek()[0] < h) {
                pairs += stack.peek()[1];
                stack.pop();
            }

            if (!stack.isEmpty() && stack.peek()[0] == h) {
                long sameCnt = stack.peek()[1];
                pairs += sameCnt;
                cntSame += sameCnt;
                stack.pop();

                if (!stack.isEmpty()) {
                    pairs += 1;
                }
            } else {
                if (!stack.isEmpty()) {
                    pairs += 1;
                }
            }

            stack.push(new long[] { h, cntSame });
        }

        System.out.println(pairs);
    }
}
