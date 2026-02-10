package lecture.java;

import java.util.Stack;

class S5_3_크레인_인형뽑기 {
    public static void solution(int n, int[][] board, int m, int[] moves) {
        // int answer = 0;
        // Stack<Integer> stack = new Stack<>();

        // for (int i = 0; i < m; i++) {
        //     int line = moves[i] - 1;

        //     for (int j = 0; j < n; j++) {
        //         if (board[j][line] != 0) {

        //             if (!stack.isEmpty() && stack.peek() == board[j][line]) {
        //                 while (stack.peek() == board[j][line]) {
        //                     stack.pop();
        //                     answer += 2;
        //                 }
        //             } else {
        //                 stack.push(board[j][line]);
        //             }

        //             board[j][line] = 0;
        //             break;
        //         }
        //     }

        // }

        // System.out.println(answer);

        int answer = 0;
        Stack<Integer> stack = new Stack<>();
        for (int pos : moves) {
            for (int i = 0; i < board.length; i++) {
                if (board[i][pos - 1] != 0) {
                    int tmp = board[i][pos - 1];
                    board[i][pos - 1] = 0;

                    if (!stack.isEmpty() && stack.peek() == tmp) {
                        answer += 2;
                        stack.pop();
                    } else {
                        stack.push(tmp);                        
                    }

                    break;
                }
            }
        }

        System.out.println(answer);
    }
}
