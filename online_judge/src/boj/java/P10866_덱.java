import java.util.ArrayDeque;
import java.util.Deque;

class P10866_덱 {
    public static void process(String[] lines) {
        Deque<Integer> deque = new ArrayDeque<>();
        StringBuilder sb = new StringBuilder();

        for (String line : lines) {
            String[] splited = line.split(" ");
            String command = splited[0];

            switch (command) {
                case "push_front":
                    deque.addFirst(Integer.parseInt(splited[1]));
                    break;
                case "push_back":
                    deque.addLast(Integer.parseInt(splited[1]));
                    break;
                case "pop_front":
                    sb.append(deque.isEmpty() ? -1 : deque.pollFirst()).append("\n");
                    break;
                case "pop_back":
                    sb.append(deque.isEmpty() ? -1 : deque.pollLast()).append("\n");
                    break;
                case "size":
                    sb.append(deque.size()).append("\n");
                    break;
                case "empty":
                    sb.append(deque.isEmpty() ? 1 : 0).append("\n");
                    break;
                case "front":
                    sb.append(deque.isEmpty() ? -1 : deque.peekFirst()).append("\n");
                    break;
                case "back":
                    sb.append(deque.isEmpty() ? -1 : deque.peekLast()).append("\n");
                    break;
            }
        }

        System.out.println(sb);
    }
}
