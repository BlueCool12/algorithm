import java.util.ArrayDeque;
import java.util.Queue;

/**
 * 1. BFS 너비 우선 탐색 문제
 */
class P21736_헌내기는_친구가_필요해 {
    public static void get(int N, int M, int[] now, char[][] school, boolean[][] visited) {

        Queue<int[]> queue = new ArrayDeque<>();
        queue.add(new int[] { now[0], now[1] });
        visited[now[0]][now[1]] = true;

        int[][] movements = { { 0, 1 }, { 0, -1 }, { 1, 0 }, { -1, 0 } };

        int count = 0;
        while (!queue.isEmpty()) {
            int[] current = queue.poll();

            if (school[current[0]][current[1]] == 'P') {
                count++;
            }

            for (int[] movement : movements) {
                int nx = current[0] + movement[0];
                int ny = current[1] + movement[1];

                if (nx >= 0 && nx < N &&
                        ny >= 0 && ny < M &&
                        school[nx][ny] != 'X' &&
                        !visited[nx][ny]) {
                    visited[nx][ny] = true;
                    queue.add(new int[] { nx, ny });
                }
            }
        }

        System.out.println(count == 0 ? "TT" : count);
    }
}
