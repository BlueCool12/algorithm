import java.util.ArrayDeque;
import java.util.Deque;

class P7576_토마토 {
    public static void get(int M, int N, int[][] tomatoBox) {

        int[][] daysToRipen = new int[N][M];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                daysToRipen[i][j] = tomatoBox[i][j] == -1 ? -2 : -1;
            }
        }

        Deque<int[]> queue = new ArrayDeque<>();
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (tomatoBox[i][j] == 1) {
                    daysToRipen[i][j] = 0;
                    queue.add(new int[] { i, j });
                }
            }
        }

        int[][] directions = { { 1, 0 }, { -1, 0 }, { 0, 1 }, { 0, -1 } };

        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            int currentRow = current[0];
            int currentCol = current[1];

            for (int[] direction : directions) {
                int nextRow = currentRow + direction[0];
                int nextCol = currentCol + direction[1];

                if (nextRow >= 0 && nextCol >= 0 &&
                        nextRow < N && nextCol < M &&
                        tomatoBox[nextRow][nextCol] != -1 &&
                        daysToRipen[nextRow][nextCol] == -1) {
                    daysToRipen[nextRow][nextCol] = daysToRipen[currentRow][currentCol] + 1;
                    queue.add(new int[] { nextRow, nextCol });
                }
            }
        }

        int maxDays = -1;

        for (int[] row : daysToRipen) {
            for (int days : row) {
                if (days == -1) {
                    System.out.println(maxDays);
                    return;
                } else {
                    maxDays = Math.max(maxDays, days);
                }
            }
        }

        System.out.println(maxDays);
    }
}
