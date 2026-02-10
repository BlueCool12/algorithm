package lecture.java;

import java.util.Stack;

class S5_1_올바른_괄호 {
    public static void solution(String parentheses) {
        // String answer = "YES";
        // Stack<Character> stack = new Stack<>();

        // for (char p : parentheses.toCharArray()) {

        //     if (stack.isEmpty() || (!stack.isEmpty() && stack.peek() == '(')) {
        //         stack.push(p);
        //     } else {
        //         stack.pop();
        //     }

        // }

        // answer = stack.size() != 0 ? "NO" : answer;
        // System.out.println(answer);

        String answer = "YES";
        Stack<Character> stack = new Stack<>();

        for (char p : parentheses.toCharArray()) {
            if (p == '(') {
                stack.push(p);
            } else {
                if (stack.isEmpty()) {
                    answer = "NO";
                    break;
                }

                stack.pop();
            }
        }

        if (!stack.isEmpty()) {
            answer = "NO";
        }

        System.out.println(answer);
    }
}
