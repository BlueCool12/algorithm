package lecture.java;

import java.util.Stack;

class S5_2_괄호문자제거 {
    public static void solution(String str) {
        // StringBuilder sb = new StringBuilder();

        // Stack<Character> stack = new Stack<>();
        // for (char ch : str.toCharArray()) {
        //     if (ch == '(') {
        //         stack.push(ch);
        //     } else if (ch == ')') {
        //         stack.pop();
        //     }

        //     if (stack.isEmpty() && ch != ')') {
        //         sb.append(ch);
        //     }
        // }

        // System.out.println(sb.toString());

        String answer = "";
        Stack<Character> stack = new Stack<>();

        for (char ch : str.toCharArray()) {
            if (ch == ')') {
                while (stack.pop() != '(');                 
            } else {
                stack.push(ch);
            }
        }        

        for (int i = 0; i < stack.size(); i++) {
            answer += stack.get(i);
        }

        System.out.println(answer);
    }
}
