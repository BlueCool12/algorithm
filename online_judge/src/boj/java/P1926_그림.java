import java.util.ArrayDeque;
import java.util.Deque;

/**
 * 1. BFS를 활용한 문제
 */
class P1926_그림 {
    public static void get(int n, int m, int[][] image) {

        Deque<int[]> queue = new ArrayDeque<>();
        boolean[][] visited = new boolean[n][m];

        int[][] movements = { { 0, 1 }, { 0, -1 }, { 1, 0 }, { -1, 0 } };

        int count = 0;
        int tempSize = 0;
        int maxSize = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {

                if (image[i][j] != 0 && !visited[i][j]) {
                    visited[i][j] = true;
                    queue.offer(new int[] { i, j });
                    count++;
                    tempSize = 1;
                }

                while (!queue.isEmpty()) {
                    int[] current = queue.poll();
                    int row = current[0];
                    int col = current[1];

                    for (int[] movement : movements) {
                        int nextRow = row + movement[0];
                        int nextCol = col + movement[1];                        

                        if (nextRow >= 0 && nextCol >= 0
                                && nextRow < n && nextCol < m
                                && image[nextRow][nextCol] != 0
                                && !visited[nextRow][nextCol]) {
                            visited[nextRow][nextCol] = true;
                            queue.offer(new int[] { nextRow, nextCol });
                            tempSize++;
                        }
                    }
                }

                maxSize = Math.max(maxSize, tempSize);

            }
        }

        System.out.println(count);
        System.out.println(maxSize);
    }
}
