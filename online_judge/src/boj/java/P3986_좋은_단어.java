import java.util.ArrayDeque;
import java.util.Deque;

/**
 * 1. Stack을 이용한 풀이
 */
class P3986_좋은_단어 {
    public static void count(String[] words) {

        Deque<Character> stack = new ArrayDeque<>();

        int count = 0;
        for (String word : words) {
            stack.clear();

            for (char ch : word.toCharArray()) {

                if (!stack.isEmpty()) {
                    if (stack.peek() == ch) {
                        stack.pop();
                    } else {
                        stack.push(ch);
                    }
                } else {
                    stack.push(ch);
                }
            }

            if (stack.size() == 0) {
                count++;
            }
        }

        System.out.println(count);
    }
}
